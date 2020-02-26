package com.hzq.nacos.caseadminperson;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import feign.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude = {DruidDataSourceAutoConfigure.class}, scanBasePackages = "com.hzq.nacos.caseadminperson")
@MapperScan(basePackages = {"com.hzq.nacos.caseadminperson.**.mapper"})
@EnableDiscoveryClient
@EnableFeignClients
public class CaseAdminPersonApplication {

    public static void main(String[] args) {
        SpringApplication.run(CaseAdminPersonApplication.class, args);
    }

    @Bean
    Logger.Level feignLogger() {
        return Logger.Level.FULL;
    }
}
