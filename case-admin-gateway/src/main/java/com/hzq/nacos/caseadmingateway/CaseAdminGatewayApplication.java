package com.hzq.nacos.caseadmingateway;

import com.hzq.nacos.caseadmingateway.config.UriKeyResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;


/**
 * @author huzq
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CaseAdminGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(CaseAdminGatewayApplication.class, args);
    }

    @Bean
    public UriKeyResolver uriKeyResolver() {
        return new UriKeyResolver();
    }
}
