package com.hzq.nacos.caseadminauth;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author caohanye
 */
@SpringBootApplication(exclude =  {DruidDataSourceAutoConfigure.class },scanBasePackages = "com.hzq.nacos.caseadminauth")
@MapperScan(basePackages={"com.hzq.nacos.caseadminauth.**.mapper"})
@EnableDiscoveryClient
@EnableFeignClients
public class CaseAdminAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(CaseAdminAuthApplication.class, args);
    }

}
