package com.hzq.nacos.caseadmingateway.config.annotation;

import java.lang.annotation.*;

/**
 * 描述: 记录调用时间
 * <p>
 * lzx
 * 2019/2/11 09:57
 *
 * @author caohanye
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ExecuteTime {

    String value() default "";
}
