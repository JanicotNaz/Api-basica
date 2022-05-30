package com.example.demo.start

import com.example.demo.domain.data.商品
import com.example.demo.domain.data.売り手
import com.example.demo.domain.ports.spi.基礎CRUDのアダプター
import com.example.demo.domain.ports.spi.売り手基礎CRUDのアダプター
import com.example.demo.utils.tools.刷る
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
class ブート:ApplicationRunner {

    @Autowired
    private lateinit var サービスの商品の変数: 基礎CRUDのアダプター<商品, String>

    @Autowired
    private lateinit var サービスの売り手の変数: 売り手基礎CRUDのアダプター<売り手,Int>

    override fun run(args: ApplicationArguments?) {
        if(サービスの売り手の変数.売り手の配列を取るんです().isEmpty()){
            val 売り手の変数 = サービスの売り手の変数.保存する(売り手(名前 = "山田", メール = "janicot@email.com" ))
            if (サービスの商品の変数.商品の配列を取るんです().isEmpty()){
                listOf(商品(名前 = "林檎", 値段 = 22.2, 株商品 = 5, 売り手の変数 = 売り手の変数),商品(名前 = "オレンジ", 値段 = 33.8, 株商品 = 4,売り手の変数 = 売り手の変数)).forEach {
                    刷る.印刷("保存する -> ${it.名前}")
                    サービスの商品の変数.保存する(it)
                }
            }
        }
    }
}