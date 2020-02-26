package com.hzq.nacos.caseadmindocase;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import feign.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

/**
 * @author caohanye
 */
@SpringBootApplication(exclude = {DruidDataSourceAutoConfigure.class}, scanBasePackages = "com.hzq.nacos.caseadmindocase")
@MapperScan(basePackages = {"com.hzq.nacos.caseadmindocase.**.mapper"})
@EnableDiscoveryClient
@EnableFeignClients
public class CaseAdminDocaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(CaseAdminDocaseApplication.class, args);
    }

    @Bean
    Logger.Level feignLogger() {
        return Logger.Level.FULL;
    }
}
