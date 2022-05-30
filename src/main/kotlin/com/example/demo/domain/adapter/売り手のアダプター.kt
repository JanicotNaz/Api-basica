package com.example.demo.domain.adapter

import com.example.demo.domain.data.商品
import com.example.demo.domain.data.売り手
import com.example.demo.domain.ports.api.売り手基礎CRUD
import com.example.demo.domain.ports.spi.売り手基礎CRUDのアダプター

class 売り手のアダプター: 売り手基礎CRUDのアダプター<売り手,Int>{

    private var 売り手CRUDの変数: 売り手基礎CRUD<売り手, Int>

    constructor(売り手基礎CRUDの変数: 売り手基礎CRUD<売り手, Int>){ this.売り手CRUDの変数 = 売り手基礎CRUDの変数 }

    override fun 売り手の配列を取るんです(): List<売り手> = this.売り手CRUDの変数.売り手の配列を取るんです()

    override fun カウンターする(): Int = this.売り手CRUDの変数.カウンターする()

    override fun 除く(id: Int): 売り手  = this.売り手CRUDの変数.除く(id)

    override fun 更新する(t: 売り手): 売り手 = this.売り手CRUDの変数.更新する(t)

    override fun 保存する(t: 売り手): 売り手 = this.売り手CRUDの変数.保存する(t)

    override fun 売り手が一つあります(id: Int): 売り手? = this.売り手CRUDの変数.売り手が一つあります(id)
}