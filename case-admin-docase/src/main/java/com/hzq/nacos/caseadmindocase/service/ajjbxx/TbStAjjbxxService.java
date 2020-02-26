package com.hzq.nacos.caseadmindocase.service.ajjbxx;

import com.hzq.nacos.caseadmincommon.util.TransmissionEntity;
import com.hzq.nacos.caseadmindocase.entity.ajjbxx.TbStAjjbxx;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @Author: huzq
 * @Date: 2020/1/17/2:54 下午
 * @Description: case-admin
 */
public interface TbStAjjbxxService extends IService<TbStAjjbxx> {

    /**
     * 根据案件编号跟新案件和人员
     *
     * @param ajbh
     * @return
     */
    TransmissionEntity updateCaseByAjbh(String ajbh);
}
