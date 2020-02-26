package com.hzq.nacos.caseadmindocase.service.ajjbxx.impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hzq.nacos.caseadmincommon.util.TransmissionEntity;
import com.hzq.nacos.caseadmindocase.entity.ajjbxx.TbStAjjbxx;
import com.hzq.nacos.caseadmindocase.mapper.ajjbxx.TbStAjjbxxMapper;
import com.hzq.nacos.caseadmindocase.service.ajjbxx.TbStAjjbxxService;
import com.hzq.nacos.caseadmindocase.service.feign.MqFeign;
import com.hzq.nacos.caseadmindocase.service.feign.SuspectsFeign;
import io.seata.core.context.RootContext;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: huzq
 * @Date: 2020/1/17/2:54 下午
 * @Description: case-admin
 */
@Service
@Slf4j
public class TbStAjjbxxServiceImpl extends ServiceImpl<TbStAjjbxxMapper, TbStAjjbxx> implements TbStAjjbxxService {
    @Resource
    private SuspectsFeign suspectsFeign;
    @Resource
    private MqFeign mqFeign;
    @Resource
    private TbStAjjbxxMapper ajjbxxMapper;

    /**
     * 根据案件编号跟新案件和人员
     *
     * @param ajbh
     * @return
     */
    @Override
    @GlobalTransactional(name = "updateCaseByAjbh")
    public TransmissionEntity updateCaseByAjbh(String ajbh) {
        log.info("当前 XID: {}", RootContext.getXID());
        TransmissionEntity transmissionEntity = new TransmissionEntity();
        transmissionEntity.setMessage("");
        transmissionEntity.setWhetherSucceed(true);
        boolean update = ajjbxxMapper.updateDjsj(ajbh);
//        boolean update = update(new UpdateWrapper<TbStAjjbxx>().eq("AJBH", ajbh).set("DJSJ", LocalDateTime.now()));
        log.info("案件更新{}", update);
        String suspect = suspectsFeign.updatePerson(ajbh);
        log.info("嫌疑人更新{}", suspect);
        String mqReturn = mqFeign.sendCaseMq(JSON.toJSONString(list(new QueryWrapper<TbStAjjbxx>().eq("AJBH", ajbh))));
        log.info("消息发送{}", mqReturn);
        return transmissionEntity;
    }
}
