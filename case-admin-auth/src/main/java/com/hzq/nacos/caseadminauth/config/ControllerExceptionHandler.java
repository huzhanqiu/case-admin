package com.hzq.nacos.caseadminauth.config;

import com.hzq.nacos.caseadmincommon.exception.CaseAdminException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

/**
 * 错误异常统一管理
 *
 * @Author: huzq
 * @Date: 2019-03-07/23:02
 * @Description: zhjd
 */
@ControllerAdvice
@Slf4j
public class ControllerExceptionHandler {

    /**
     * 这个注解是指当controller中抛出这个指定的异常类的时候，都会转到这个方法中来处理异常
     *
     * @param ex 错误
     * @return
     */

    @ExceptionHandler(CaseAdminException.class)
    @ResponseBody
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public Map<String, Object> handlerUserNotExistException(CaseAdminException ex) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("状态", ex.getCode());
        result.put("错误原因", ex.getMsg());
        log.error("报错信息{}", ex);
        return result;
    }
}