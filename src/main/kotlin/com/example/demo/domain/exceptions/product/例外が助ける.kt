package com.example.demo.domain.exceptions.product

import com.example.demo.controller.管理者の商品
import com.example.demo.controller.管理者の売り手
import com.example.demo.domain.data.エラー応答
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import java.time.Instant

@ControllerAdvice(assignableTypes = [管理者の商品::class, 管理者の売り手::class])
class 例外が助ける {

   @ExceptionHandler(value = [項目が探さない::class])
   fun 項目が探さない扱い(e: 項目が探さない): ResponseEntity<Any?>? = ResponseEntity(エラー応答()
       .時間を受ける(Instant.now().toEpochMilli()).調子を受ける(404)
       .メッセージを受ける(e.message?.uppercase()?.replace(" ", "_"))
       .エラーを受ける(e.message).道を受ける("${e.url}"), HttpStatus.NOT_FOUND)

    @ExceptionHandler(value = [項目は無効です::class])
    fun 項目が無効する扱い(e: 項目は無効です): ResponseEntity<Any?>? {

        return ResponseEntity(エラー応答()
            .時間を受ける(Instant.now().toEpochMilli()).調子を受ける(404)
            .メッセージを受ける(e.message?.uppercase()?.replace(" ", "_"))
            .エラーを受ける(e.message).道を受ける("/api/v1/product/${e.url}"), HttpStatus.NOT_FOUND)
    }

}