package com.example.demo.insfrastructure.entity

import javax.persistence.*

@Entity
@Table(name = "PROVIDER")
data class 売り手のエンティティ (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    var id:Int? = 0,
    @Column(name = "NAME")
    var 名前: String?,
    @Column(name = "EMAIL")
    var メール:String?
    ){
    fun 名前を受ける(名前: String?): 売り手のエンティティ {
        this.名前 = 名前
        return this
    }

    fun idを受ける(id:Int?): 売り手のエンティティ {
        this.id = id
        return this
    }

    fun メールを受ける(メール: String?): 売り手のエンティティ {
        this.メール = メール
        return this
    }
}