package com.example.demo.domain.exceptions.product

class 項目は無効です(val メッセージ: String, val url: String = "" ): RuntimeException() {

    override val message: String?
        get() =  this.メッセージ
}