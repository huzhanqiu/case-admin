package com.hzq.nacos.caseadmincommon.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @author huzq
 * @title: CaseAdminException
 * @projectName case-admin
 * @description: 异常处理类
 * @date 2020/2/710:53 下午
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
@AllArgsConstructor
public class CaseAdminException extends RuntimeException {
    private long code;
    private String msg;
}
