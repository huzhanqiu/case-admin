package com.hzq.nacos.caseadmindocase.service.feign;

import io.seata.core.context.RootContext;
import io.seata.core.exception.TransactionException;
import io.seata.tm.TransactionManagerHolder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @Author: huzq
 * @Date: 2020/1/17/3:24 下午
 * @Description: case-admin
 */
@Component
@Slf4j
public class SuspectsFeignRollBack implements SuspectsFeign {
    @Override
    public String selectPerson(String ajbh) {
        try {
            TransactionManagerHolder.get().rollback(RootContext.getXID());
        } catch (TransactionException e) {
            log.error(e.getMessage(), e);
        }
        return null;
    }

    @Override
    public String updatePerson(String ajbh) {
        try {
            TransactionManagerHolder.get().rollback(RootContext.getXID());
        } catch (TransactionException e) {
            log.error(e.getMessage(), e);
        }
        return null;
    }
}
