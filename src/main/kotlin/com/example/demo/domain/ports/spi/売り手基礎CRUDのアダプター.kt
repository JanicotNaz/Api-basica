package com.example.demo.domain.ports.spi

interface 売り手基礎CRUDのアダプター<T,ID> {
    fun 売り手の配列を取るんです():List<T>
    fun 売り手が一つあります(id:ID):T?
    fun 保存する(t:T):T
    fun 更新する(t:T):T
    fun 除く(id: ID): T
    fun カウンターする():Int
}