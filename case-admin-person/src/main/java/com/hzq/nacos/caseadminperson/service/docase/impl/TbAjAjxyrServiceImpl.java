package com.hzq.nacos.caseadminperson.service.docase.impl;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hzq.nacos.caseadminperson.entity.docase.TbAjAjxyr;
import com.hzq.nacos.caseadminperson.mapper.docase.TbAjAjxyrMapper;
import com.hzq.nacos.caseadminperson.service.docase.TbAjAjxyrService;
import com.hzq.nacos.caseadminperson.service.feign.AccountFeign;
import io.seata.core.context.RootContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.time.LocalDateTime;

/**
 * @Author: huzq
 * @Date: 2020/1/18/2:51 下午
 * @Description: case-admin
 */
@Service
@Slf4j
public class TbAjAjxyrServiceImpl extends ServiceImpl<TbAjAjxyrMapper, TbAjAjxyr> implements TbAjAjxyrService {
    @Resource
    private AccountFeign accountFeign;

    /**
     * 修改人员信息
     *
     * @param ajbh
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean updatePerson(String ajbh) {
        log.info("当前 XID: {}", RootContext.getXID());
        boolean update = update(new UpdateWrapper<TbAjAjxyr>().eq("AJBH", ajbh).set("DJSJ", LocalDateTime.now()));
        accountFeign.getPk();
//        String excep = null;
//        excep.substring(0,10);
        return update;
    }
}
