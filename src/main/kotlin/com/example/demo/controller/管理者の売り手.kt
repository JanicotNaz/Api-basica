package com.example.demo.controller

import com.example.demo.domain.data.売り手
import com.example.demo.domain.ports.spi.売り手基礎CRUDのアダプター
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/provider")
class 管理者の売り手( 売り手のアダプターの変数: 売り手基礎CRUDのアダプター<売り手, Int>): 抽象の管理者の売り手<売り手,Int>(売り手のアダプターの変数) {

}