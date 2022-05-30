package com.example.demo.configuration

import com.example.demo.domain.data.商品
import com.example.demo.domain.ports.api.基礎CRUD
import com.example.demo.domain.ports.spi.基礎CRUDのアダプター
import com.example.demo.domain.service.サービスの商品
import com.example.demo.domain.adapter.商品のアダプター
import com.example.demo.domain.adapter.売り手のアダプター
import com.example.demo.domain.data.売り手
import com.example.demo.domain.ports.api.売り手基礎CRUD
import com.example.demo.domain.ports.spi.売り手基礎CRUDのアダプター
import com.example.demo.domain.service.サービスの売り手
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration

class 使用者の構成する {

    @Bean
    fun 使用者の基礎CRUD ():基礎CRUD<商品,String> = サービスの商品()

    @Bean
    fun 使用者の基礎CRUDのアダプター(): 基礎CRUDのアダプター<商品,String> = 商品のアダプター(使用者の基礎CRUD())

    @Bean
    fun 使用者の売り手基礎CRUD (): 売り手基礎CRUD<売り手, Int> = サービスの売り手()

    @Bean
    fun 使用者の売り手基礎CRUDのアダプター(): 売り手基礎CRUDのアダプター<売り手, Int> = 売り手のアダプター(使用者の売り手基礎CRUD())

}