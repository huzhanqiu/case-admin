package com.hzq.nacos.caseadmindocase.controller.ajjbxx;


import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.hzq.nacos.caseadmincommon.entity.feign.person.TbAjAjxyr;
import com.hzq.nacos.caseadmincommon.util.TransmissionEntity;
import com.hzq.nacos.caseadmindocase.entity.ajjbxx.TbStAjjbxx;
import com.hzq.nacos.caseadmindocase.service.ajjbxx.TbStAjjbxxService;
import com.hzq.nacos.caseadmindocase.service.feign.SuspectsFeign;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @Author: huzq
 * @Date: 2020/1/16/10:13 下午
 * @Description: case-admin
 */
@Slf4j
@Api(value = "案件处理", tags = "案件处理")
@RestController
@RequestMapping("/api/docase/case")
public class CaseController {
    @Resource
    private TbStAjjbxxService ajjbxxService;
    @Resource
    private SuspectsFeign suspectsFeign;

    @ApiOperation(value = "根据案件标号查询案件", notes = "ajbh=")
    @ApiImplicitParam(name = "ajbh", required = true)
    @GetMapping("/getCaseBasic")
    public Map<String, Object> getCaseBasic(String ajbh) {
        Map<String, Object> returnMap = new HashMap<>(1024);
        List<TbStAjjbxx> tbStAjjbxxes = ajjbxxService.listByIds(Arrays.asList(ajbh));
        String person = suspectsFeign.selectPerson(ajbh);
        returnMap.put("caseBasic", tbStAjjbxxes);
        returnMap.put("suspect", JSONObject.parseArray(person, TbAjAjxyr.class));
        return returnMap;
    }

    @PutMapping("/updateCaseByAjbh")
    @ApiOperation(value = "根据案件标号修改案件", notes = "ajbh=")
    @ApiImplicitParam(name = "ajbh", required = true)
    public TransmissionEntity updateCaseByAjbh(String ajbh) {
        TransmissionEntity transmissionEntity = ajjbxxService.updateCaseByAjbh(ajbh);

        return transmissionEntity;
    }
}
