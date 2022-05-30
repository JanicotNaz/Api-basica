package com.example.demo.domain.exceptions.product



class 項目が探さない(val メッセージ: String, val url: String = "" ): RuntimeException() {
    override val message: String?
        get() =  this.メッセージ


}