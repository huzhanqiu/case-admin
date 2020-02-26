package com.hzq.nacos.caseadminauth.service.sys.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hzq.nacos.caseadminauth.mapper.sys.TSysAccountRoleMapper;
import com.hzq.nacos.caseadminauth.entity.sys.TSysAccountRole;
import com.hzq.nacos.caseadminauth.service.sys.TSysAccountRoleService;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: huzq
 * @Date: 2020/1/14/11:04 下午
 * @Description: case-admin
 */
@Service
public class TSysAccountRoleServiceImpl extends ServiceImpl<TSysAccountRoleMapper, TSysAccountRole> implements TSysAccountRoleService {

    /**
     * 根据accpunt的主键查询所有角色
     *
     * @param pk 主键
     * @return 所有角色
     */
    @Override
    public List<String> listByUserId(String pk) {
        return list(new QueryWrapper<TSysAccountRole>().eq("USERID", pk)).stream().map(TSysAccountRole::getRoleid).collect(Collectors.toList());
    }
}
