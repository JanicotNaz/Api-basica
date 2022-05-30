package com.example.demo.utils.tools

import com.example.demo.domain.data.商品
import com.example.demo.domain.data.売り手
import com.example.demo.domain.exceptions.product.項目が探さない

object 確認する {
    fun <T> 有るんです(t: T, 文章: String){
        when(t){
            is 商品 ->(t as? 商品)?.let {
                if (it.名前 == null) throw 項目が探さない("${文章} null name", "/api/v1/product")
                if (it.名前!!.length >= 20 || t.名前!!.isEmpty()) throw 項目が探さない("${文章} name is long or short", "/api/v1/product")
                if (it.値段 == null) throw 項目が探さない("${文章} null Cost", "/api/v1/product")
                if (it.値段!! < 0 ) throw 項目が探さない("${文章} Cost not negative", "/api/v1/product")
            }
            is 売り手 -> (t as? 売り手)?.let {
                if (it.名前 == null) throw 項目が探さない("${文章} null name", "/api/v1/provide")
                if (it.名前!!.length >= 20 || t.名前!!.isEmpty()) throw 項目が探さない("${文章} name is long or short", "/api/v1/provide")
                if (it.メール == null) throw 項目が探さない("${文章} null Cost", "/api/v1/provide")
            }
        }



    }
}