package com.example.demo.controller

import com.example.demo.domain.adapter.商品のアダプター
import com.example.demo.domain.data.商品
import com.example.demo.domain.ports.spi.基礎CRUDのアダプター
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/product")
class 管理者の商品( 商品のアダプターの変数: 基礎CRUDのアダプター<商品,String>): 抽象の管理者の商品<商品,String>(商品のアダプターの変数){

    /*@Autowired(required=true)
    private lateinit var 商品のアダプターの変数: 基礎CRUDのアダプター<商品,String>*/
/*
    @PostMapping
    fun 保存する(@RequestBody body:商品):ResponseEntity<Boolean>{
        var 頭: HttpHeaders = HttpHeaders()
        return ResponseEntity(商品のアダプターの変数.保存する(body),頭, HttpStatus.OK)
    }

    @PutMapping("/{id}")
    fun 商品の配列が更新する(@PathVariable id:String, @RequestBody body: 商品):ResponseEntity<Boolean>{
        var 頭: HttpHeaders = HttpHeaders()
        return ResponseEntity(商品のアダプターの変数.更新する(body.UUIDを受ける(id)),頭, HttpStatus.OK)
    }

    @DeleteMapping("/{id}")
    fun 除く(@PathVariable id:String): ResponseEntity<Boolean>{
        var 頭: HttpHeaders = HttpHeaders()
        return ResponseEntity(商品のアダプターの変数.除く(id), 頭, HttpStatus.OK)

    }

    @GetMapping("/{id}")
    fun 商品の配列が一つある(@PathVariable id: String):ResponseEntity<商品>{
        var 頭: HttpHeaders = HttpHeaders()
        頭.add("Total-Elements",商品のアダプターの変数.カウンターする().toString())
        return ResponseEntity(商品のアダプターの変数.商品が一あります(id),頭, HttpStatus.OK)
    }

    @GetMapping
    fun 商品の配列を取るんです():ResponseEntity<List<商品>> {
        var 頭: HttpHeaders = HttpHeaders()
        頭.add("Total-Elements",商品のアダプターの変数.カウンターする().toString())
        return ResponseEntity(商品のアダプターの変数.商品の配列を取るんです(),頭, HttpStatus.OK)
    }*/
}