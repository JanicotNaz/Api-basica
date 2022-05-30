package com.example.demo.domain.data

import javax.validation.constraints.Email

data class 売り手 (
    var id:Int? = 0,
    var 名前: String?,
    @field:Email
    var メール: String?){
    override fun equals(other: Any?): Boolean {
        other?.let {
            if (it === this) return true
            if (this.javaClass != it.javaClass) return false
            it as 売り手
            return this.名前 == it.名前
        } ?:run{return false}
    }

    fun 名前を受ける(名前: String?): 売り手{
        this.名前 = 名前
        return this
    }

    fun idを受ける(id:Int?): 売り手{
        this.id = id
        return this
    }

    fun メールを受ける(メール: String?): 売り手{
        this.メール = メール
        return this
    }
}