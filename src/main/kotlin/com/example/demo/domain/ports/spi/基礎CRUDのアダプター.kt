package com.example.demo.domain.ports.spi

interface 基礎CRUDのアダプター<T,ID> {

    fun 商品の配列を取るんです():List<T>
    fun 商品が一あります(id:ID):T?
    fun 保存する(t:T):T
    fun 更新する(t:T):T
    fun 除く(id: ID): T
    fun カウンターする():Int
}