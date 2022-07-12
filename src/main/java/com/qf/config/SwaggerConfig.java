package com.qf.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {
    @Bean
    public Docket docket() {
        ApiInfo info = new ApiInfoBuilder()
                .contact(new Contact("实习项目", "https://www.bilibili.com", "754946573@qq.com"))
                .title(" - 在线API接口文档")
                .description("这是一后端API文档，欢迎前端人员查阅！")
                .build();
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(info)
                .select()       //对项目中的所有API接口进行选择
                .apis(RequestHandlerSelectors.basePackage("com.qf.controller"))
                .build();

    }
}
