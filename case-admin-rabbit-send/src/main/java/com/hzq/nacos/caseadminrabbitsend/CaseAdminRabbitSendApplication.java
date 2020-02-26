package com.hzq.nacos.caseadminrabbitsend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author caohanye
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CaseAdminRabbitSendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CaseAdminRabbitSendApplication.class, args);
	}

}
