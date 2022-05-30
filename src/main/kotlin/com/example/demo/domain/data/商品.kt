package com.example.demo.domain.data

import java.util.UUID
import javax.validation.constraints.*

data class 商品(
    @field:NotEmpty
    @field:NotNull
    var 名前:String?,
    @field:Min(0)
    var 値段: Double? = 55.5,

    var uuid: String? = UUID.randomUUID().toString(),
    @field:Min(0)
    var 株商品: Int = 0,
    var 売り手の変数: 売り手? = null
    ){
    override fun equals(other: Any?): Boolean {
        other?.let {
            if (it === this) return true
            if (this.javaClass != it.javaClass) return false
            it as 商品
            return this.名前 == it.名前
        } ?:run{return false}
    }

    fun 売り手を受ける(売り手の変数: 売り手?): 商品{
        this.売り手の変数 = 売り手の変数
        return this
    }

    fun 名前を受ける(名前: String?): 商品{
        this.名前 = 名前
        return this
    }

    fun UUIDを受ける(uuid: String?): 商品{
        this.uuid = uuid
        return this
    }

    fun 値段を受ける(値段: Double?): 商品{
        this.値段 = 値段
        return this
    }

    fun 株商品を受ける(株商品: Int): 商品{
        this.株商品 = 株商品
        return this
    }

}
