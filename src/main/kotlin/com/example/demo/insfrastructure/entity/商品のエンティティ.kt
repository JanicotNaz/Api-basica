package com.example.demo.insfrastructure.entity

import com.example.demo.domain.data.商品
import com.example.demo.domain.data.売り手
import java.util.UUID
import javax.persistence.*

@Entity
@Table(name = "PRODUCT")
data class 商品のエンティティ (
    @Column(name = "NAME")
    var 名前:String?,
    @Column(name = "COST")
    var 値段:Double? = 55.5,
    @Id
    @Column(name = "ID")
    var uuid:String? = UUID.randomUUID().toString(),
    @Column(name = "STOCK")
    var 株商品:Int = 0,
    @ManyToOne
    @JoinColumn(name = "PROVIDER")
    var 売り手のエンティティの変数:売り手のエンティティ?
    ){
    fun 名前を受ける(名前: String?): 商品のエンティティ {
        this.名前 = 名前
        return this
    }

    fun UUIDを受ける(uuid: String?): 商品のエンティティ {
        this.uuid = uuid
        return this
    }

    fun 値段を受ける(値段: Double?): 商品のエンティティ {
        this.値段 = 値段
        return this
    }

    fun 株商品を受ける(株商品: Int): 商品のエンティティ {
        this.株商品 = 株商品
        return this
    }
    fun 売り手を受ける(売り手のエンティティの変数: 売り手のエンティティ?): 商品のエンティティ{
        this.売り手のエンティティの変数 = 売り手のエンティティの変数
        return this
    }
}