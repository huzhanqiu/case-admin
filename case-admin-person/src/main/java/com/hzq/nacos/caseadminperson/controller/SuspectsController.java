package com.hzq.nacos.caseadminperson.controller;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hzq.nacos.caseadminperson.entity.docase.TbAjAjxyr;
import com.hzq.nacos.caseadminperson.service.docase.TbAjAjxyrService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.time.LocalDateTime;

/**
 * @Author: huzq
 * @Date: 2020/1/17/4:08 下午
 * @Description: case-admin
 */
@Api(value = "案件嫌疑人", tags = "案件嫌疑人")
@RestController
@RequestMapping("/api/person/suspects")
public class SuspectsController {
    @Resource
    private TbAjAjxyrService ajXyrService;

    @ApiOperation(value = "根据案件标号查询嫌疑人", notes = "ajbh=")
    @ApiImplicitParam(name = "ajbh", required = true)
    @GetMapping("/selectPerson")
    public String selectPerson(String ajbh) {
        return JSON.toJSONString(ajXyrService.list(new QueryWrapper<TbAjAjxyr>().eq("AJBH", ajbh)));
    }

    @ApiOperation(value = "根据案件标号修改嫌疑人", notes = "ajbh=")
    @ApiImplicitParam(name = "ajbh", required = true)
    @PutMapping("/updatePerson")
    public String updatePerson(String ajbh) {
        boolean update = ajXyrService.updatePerson(ajbh);

        return JSON.toJSONString(update);
    }

}
