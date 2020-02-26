package com.hzq.nacos.caseadminauth.service.sys.impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.hzq.nacos.caseadminauth.entity.jwt.UserDTO;
import io.seata.core.context.RootContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hzq.nacos.caseadminauth.mapper.sys.TSysAccountMapper;
import com.hzq.nacos.caseadminauth.entity.sys.TSysAccount;
import com.hzq.nacos.caseadminauth.service.sys.TSysAccountService;

/**
 * @Author: huzq
 * @Date: 2020/1/14/11:04 下午
 * @Description: case-admin
 */
@Service
@Slf4j
@CacheConfig(cacheNames = {"account"})
public class TSysAccountServiceImpl extends ServiceImpl<TSysAccountMapper, TSysAccount> implements TSysAccountService {

    /**
     * 返回用户信息
     *
     * @return
     */
    @Override
    public String getPk() {
        log.info("当前 XID: {}", RootContext.getXID());
        List<TSysAccount> accounts = listByIds(Arrays.asList("CD9AE6DEBC13405A989B5FEAE0232363"));
        update(new UpdateWrapper<TSysAccount>().eq("PK", "CD9AE6DEBC13405A989B5FEAE0232363").set("xm", accounts.get(0).getXm() + "1"));
        return JSON.toJSONString(listByIds(Arrays.asList("CD9AE6DEBC13405A989B5FEAE0232363")));
    }

    /**
     * 返回用户信息
     *
     * @param userDTO 查询类
     * @return account
     */
    @Override
    @Cacheable(key = "#userDTO.dwdm+#userDTO.username")
    public TSysAccount selectByUser(UserDTO userDTO) {
        List<TSysAccount> tSysAccounts = list(new QueryWrapper<TSysAccount>().eq("username", userDTO.getUsername()));
        return tSysAccounts.size() > 0 ? tSysAccounts.get(0) : null;
    }
}
