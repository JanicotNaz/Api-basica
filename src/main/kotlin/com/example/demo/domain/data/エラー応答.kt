package com.example.demo.domain.data

class エラー応答  {
    var 時間: Long = 0
    var 調子 = 0
    var エラー: String? = null
    var メッセージ: String? = null
    var 道: String? = null

    fun 時間を受ける(時間: Long):エラー応答{
        this.時間 = 時間
        return this
    }

    fun 調子を受ける(調子: Int): エラー応答{
        this.調子 = 調子
        return this
    }

    fun エラーを受ける(エラー: String?):エラー応答{
        this.エラー = エラー
        return this
    }

    fun メッセージを受ける(メッセージ: String?): エラー応答{
        this.メッセージ = メッセージ
        return this
    }

    fun 道を受ける(道: String): エラー応答{
        this.道 = 道
        return this
    }
}