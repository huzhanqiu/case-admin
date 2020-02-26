package com.hzq.nacos.caseadmingateway.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Author: huzq
 * @Date: 2019-07-20/13:21
 * @Description: demo-gateway
 */
public class DateUtil {
    public static String getNowStr() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        return LocalDateTime.now().format(fmt);
    }
}
