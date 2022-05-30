package com.example.demo.configuration

import com.example.demo.ProductoApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2


@Configuration
@EnableSwagger2
class スワガーコート {

    @Bean
    fun エーピーアイ(): Docket = Docket(DocumentationType.SWAGGER_2).select()
        .apis(RequestHandlerSelectors.basePackage(ProductoApplication::class.java.`package`.name))
        .paths(PathSelectors.any()).build()
}