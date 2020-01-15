package com.hzq.nacos.caseadminauth.config.knife4j;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author: huzq
 * @Date: 2020/1/14/11:18 下午
 * @Description: case-admin
 */
@Configuration
@EnableSwagger2
public class Knife4jConfig {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.hzq.nacos.caseadminauth"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("案件管理登陆")
                .description("案件管理登陆系统")
                .termsOfServiceUrl("http://localhost:8285/")
                .contact("huzq@zgjzd.cn")
                .version("1.0")
                .build();
    }
}
