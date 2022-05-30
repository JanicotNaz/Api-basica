package com.example.demo.domain.adapter

import com.example.demo.domain.data.商品
import com.example.demo.domain.ports.api.基礎CRUD
import com.example.demo.domain.ports.spi.基礎CRUDのアダプター
import javax.validation.Valid

class 商品のアダプター:基礎CRUDのアダプター<商品, String> {

    private var 基礎CRUDの変数: 基礎CRUD<商品, String>

    constructor(基礎CRUDの変数: 基礎CRUD<商品, String>){
        this.基礎CRUDの変数 = 基礎CRUDの変数
    }

    override fun 商品の配列を取るんです(): List<商品> = 基礎CRUDの変数.商品の配列を取るんです()

    override fun カウンターする(): Int = 基礎CRUDの変数.カウンターする()

    override fun 除く(id: String): 商品 = 基礎CRUDの変数.除く(id)

    override fun 更新する(t: 商品): 商品 = 基礎CRUDの変数.更新する(t)

    override fun 保存する(@Valid t: 商品): 商品 = 基礎CRUDの変数.保存する(t)

    override fun 商品が一あります(id: String): 商品? = 基礎CRUDの変数.商品が一あります(id)
}