package com.zlikun.jee.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author zlikun
 * @date 2018-10-12 19:20
 */
@Configuration
public class SwaggerConfigure {

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("个人博客API契约")
                .description("个人博客API契约，用于实现前后端分离开发")
                .license("Apache 2.0")
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
                .termsOfServiceUrl("")
                .version("1.0.0")
                .contact(new Contact("张立坤", "https://zlikun.com", "zlikun-dev@hotmail.com"))
                .build();
    }

    @Bean
    public Docket customImplementation() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.zlikun.jee.api"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

}
