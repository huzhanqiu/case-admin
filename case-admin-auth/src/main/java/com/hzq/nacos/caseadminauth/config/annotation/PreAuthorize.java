package com.hzq.nacos.caseadminauth.config.annotation;

import java.lang.annotation.*;

/**
 * @Author: huzq
 * @Date: 2019/10/22 0022/17:15
 * @Description: jqxxh
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PreAuthorize {
    String hasAnyRole() default "ROLE_USER";

    String hasAnyPre() default "";
}
