package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.servlet.config.annotation.EnableWebMvc

@SpringBootApplication
@EnableWebMvc
class ProductoApplication

fun main(args: Array<String>) {
	runApplication<ProductoApplication>(*args)
}




