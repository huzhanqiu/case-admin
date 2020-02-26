package com.hzq.nacos.caseadminperson.service.docase;

import com.hzq.nacos.caseadminperson.entity.docase.TbAjAjxyr;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @Author: huzq
 * @Date: 2020/1/18/2:51 下午
 * @Description: case-admin
 */
public interface TbAjAjxyrService extends IService<TbAjAjxyr> {

    /**
     * 修改人员信息
     *
     * @param ajbh
     * @return
     */
    boolean updatePerson(String ajbh);
}
