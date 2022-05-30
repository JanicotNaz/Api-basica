package com.example.demo.domain.exceptions.product

import com.example.demo.controller.抽象の管理者の商品
import com.example.demo.controller.抽象の管理者の売り手
import com.example.demo.controller.管理者の商品
import com.example.demo.domain.data.エラー応答
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.context.request.WebRequest
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler
import java.time.Instant

@ControllerAdvice(assignableTypes = [抽象の管理者の商品::class, 抽象の管理者の売り手::class])
class 商品のエラー:ResponseEntityExceptionHandler() {
    override fun handleMethodArgumentNotValid(ex: MethodArgumentNotValidException, headers: HttpHeaders, status: HttpStatus, request: WebRequest): ResponseEntity<Any> {
        val 合計: Map<String, List<String?>> = ex.bindingResult.fieldErrors.groupBy ({it.field},{it.defaultMessage})
        val 全額 = エラー応答().時間を受ける(Instant.now().toEpochMilli()).調子を受ける(404).メッセージを受ける(合計.toString()).エラーを受ける(合計.toString())
        return ResponseEntity.status(status).headers(headers).body(全額)
    }
}