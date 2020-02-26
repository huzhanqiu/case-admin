package com.hzq.nacos.caseadminauth.service.sys;

import com.hzq.nacos.caseadminauth.entity.jwt.UserDTO;
import com.hzq.nacos.caseadminauth.entity.sys.TSysAccount;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @Author: huzq
 * @Date: 2020/1/14/11:04 下午
 * @Description: case-admin
 */
public interface TSysAccountService extends IService<TSysAccount> {

    /**
     * 返回用户信息
     *
     * @return
     */
    String getPk();

    /**
     * 返回用户信息
     *
     * @param userDTO 查询类
     * @return account
     */
    TSysAccount selectByUser(UserDTO userDTO);
}
