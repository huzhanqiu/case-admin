package com.hzq.nacos.caseadminauth.service.sys;

import com.hzq.nacos.caseadminauth.entity.sys.TSysAccountRole;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @Author: huzq
 * @Date: 2020/1/14/11:04 下午
 * @Description: case-admin
 */
public interface TSysAccountRoleService extends IService<TSysAccountRole> {

    /**
     * 根据accpunt的主键查询所有角色
     *
     * @param pk 主键
     * @return 所有角色
     */
    List<String> listByUserId(String pk);
}
