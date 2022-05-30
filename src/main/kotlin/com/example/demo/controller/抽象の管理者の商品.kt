package com.example.demo.controller

import com.example.demo.domain.data.商品
import com.example.demo.domain.ports.spi.基礎CRUDのアダプター
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.validation.Valid
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

abstract class 抽象の管理者の商品<T, ID>(private val 商品のアダプターの変数: 基礎CRUDのアダプター<T, ID>) {
//    @ApiOperation(value = "Get a product by id", notes = "Returns a product as per the id")
    @PostMapping
    fun 保存する(@Valid @RequestBody body: T): ResponseEntity<T> {
        var 頭: HttpHeaders = HttpHeaders()
        return ResponseEntity(商品のアダプターの変数.保存する(body), 頭, HttpStatus.OK)
    }

    @PutMapping("/{id}")
    fun 商品の配列が更新する(@PathVariable id: String, @Valid @RequestBody body: T): ResponseEntity<T> {

        var 頭: HttpHeaders = HttpHeaders()
        return ResponseEntity(商品のアダプターの変数.更新する((((body as? 商品)?.UUIDを受ける(id)) as T)), 頭, HttpStatus.OK)
    }

    @DeleteMapping("/{id}")
    fun 除く(@PathVariable id: ID): ResponseEntity<T> {
        var 頭: HttpHeaders = HttpHeaders()
        return ResponseEntity(商品のアダプターの変数.除く(id), 頭, HttpStatus.OK)

    }

    @GetMapping("/{id}")
    fun 商品の配列が一つある(@PathVariable id: ID): ResponseEntity<T> {
        var 頭: HttpHeaders = HttpHeaders()
        頭.add("Total-Elements", 商品のアダプターの変数.カウンターする().toString())
        return ResponseEntity(商品のアダプターの変数.商品が一あります(id), 頭, HttpStatus.OK)
    }

    @GetMapping
    fun 商品の配列を取るんです(): ResponseEntity<List<T>> {
        var 頭: HttpHeaders = HttpHeaders()
        頭.add("Total-Elements", 商品のアダプターの変数.カウンターする().toString())
        return ResponseEntity(商品のアダプターの変数.商品の配列を取るんです(), 頭, HttpStatus.OK)
    }


}
