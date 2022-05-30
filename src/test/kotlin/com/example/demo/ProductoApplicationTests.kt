package com.example.demo

import com.example.demo.domain.data.商品
import com.example.demo.domain.data.売り手
import com.example.demo.domain.ports.spi.基礎CRUDのアダプター
import com.example.demo.domain.ports.spi.売り手基礎CRUDのアダプター
import com.example.demo.domain.service.サービスの商品
import com.fasterxml.jackson.databind.ObjectMapper
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultHandlers
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import org.springframework.test.web.servlet.setup.DefaultMockMvcBuilder
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import org.springframework.web.context.WebApplicationContext
import java.util.*


@SpringBootTest
//@AutoConfigureMockMvc
@TestMethodOrder(MethodOrderer.MethodName::class)
class ProductoApplicationTests {

	@Autowired
	private lateinit var アプリウェブ: WebApplicationContext

	private val マスカラ: MockMvc by lazy { MockMvcBuilders.webAppContextSetup(アプリウェブ).alwaysDo<DefaultMockMvcBuilder>(MockMvcResultHandlers.print()).build() }

/*	@Autowired
	private lateinit var マスカラ: MockMvc
*/
	@Autowired
	private lateinit var 地図: ObjectMapper

	@Autowired
	private lateinit var サービスの商品の変数: 基礎CRUDのアダプター<商品,String>

	@Autowired
	private lateinit var サービスの売り手の変数: 売り手基礎CRUDのアダプター<売り手,Int>

	private val 初めて売り手 by lazy { サービスの売り手の変数.売り手の配列を取るんです().first() }

	private val 文章 = "/api/v1/product"

	private val 文章の売り手 = "/api/v1/provider"

	@Test
	fun a_findAll() {
		val サービスの商品の形の変数 = サービスの商品の変数.商品の配列を取るんです()
		//val 項目 = マスカラ.perform(MockMvcRequestBuilders.get("/api/v1/product")).andExpect(status().isOk).andReturn().response.getContentAsString(StandardCharsets.UTF_8)
		//val 商品の変数: List<商品> = 地図.readValue(項目)
		val 商品の変数: List<商品> = マスカラ.perform(MockMvcRequestBuilders.get(文章)).andExpect(status().isOk).体(地図)

		assertThat(サービスの商品の形の変数, Matchers.`is`(Matchers.equalTo(商品の変数)))
	}

	@Test
	fun b_finById(){
		val サービスの商品の形の変数 = サービスの商品の変数.商品の配列を取るんです()
		assert(サービスの商品の形の変数.isNotEmpty()){"Should not be empty 私"}
		val 商品の変数 = サービスの商品の形の変数.first()
		マスカラ.perform(MockMvcRequestBuilders.get("$文章/${商品の変数.uuid}"))
			.andExpect(status().isOk).andExpect(jsonPath("$.uuid", Matchers.`is`(商品の変数.uuid)))
	}

	@Test
	fun c_finByIdEmpty(){
		マスカラ.perform(MockMvcRequestBuilders.get("$文章/${UUID.randomUUID()}"))
			.andExpect(status().isNotFound)//.andExpect(jsonPath("$").doesNotExist())
	}

	@Test
	fun d_saveSuccessfully(){
		val 商品の変数 = 商品("桃", 50.0, 売り手の変数 = 初めて売り手 )
		val 合計: 商品 = マスカラ.perform(MockMvcRequestBuilders.post(文章)//.content(地図.writeValueAsBytes(商品の変数)).contentType(MediaType.APPLICATION_JSON))
			.体(商品の変数, 地図)).andExpect(status().isOk).体(地図)
		assertThat(サービスの商品の変数.商品が一あります(合計.uuid ?: ""), Matchers.`is`(合計))
	}

	@Test
	fun d2_saveSuccessFully(){
		マスカラ.perform(MockMvcRequestBuilders.post(文章).体(データ = 商品(名前 = "", 値段 = -50.0, 売り手の変数 = 初めて売り手), 地図 = 地図)).andExpect(status().isBadRequest)
			.andExpect(jsonPath("$.エラー").exists()).andExpect(jsonPath("$.メッセージ").exists())
	}

	@Test
	fun e_saveFail(){
		val サービスの商品の形の変数 = サービスの商品の変数.商品の配列を取るんです()
		assert(サービスの商品の形の変数.isNotEmpty()){"Should not be empty"}
		val 商品の変数 = サービスの商品の形の変数.first()
		val 合計: 商品 = マスカラ.perform(MockMvcRequestBuilders.post(文章).体(商品の変数, 地図)).andExpect(status().isNotFound).体(地図)
		assert(合計.名前 == null){"Should be false"}
	}

	@Test
	fun f_updateSeccessfully(){
		val サービスの商品の形の変数 = サービスの商品の変数.商品の配列を取るんです()
		assert(サービスの商品の形の変数.isNotEmpty()){"Should not be empty"}
		val 商品の変数 = サービスの商品の形の変数.first().copy(値段 = 44.23)
		val 合計: 商品 = マスカラ.perform(MockMvcRequestBuilders.put("$文章/${商品の変数.uuid}").体(商品の変数,地図)).andExpect(status().isOk).体(地図)
		assertThat(サービスの商品の変数.商品が一あります(合計.uuid ?: ""), Matchers.`is`(合計))

	}

	@Test
	fun g_updateFail(){
		val 商品の変数 = 商品("梨", 123.45)
		val 臨時: Any? =マスカラ.perform(MockMvcRequestBuilders.put("$文章/${商品の変数.uuid}").体(商品の変数, 地図)).andExpect(status().isNotFound).体(地図)
		val 合計: Boolean =  臨時 is Boolean
		assert(!合計){"Should be false"}
	}

	@Test
	fun h_deleteById(){
		val サービスの商品の形の変数 = サービスの商品の変数.商品の配列を取るんです()
		assert(サービスの商品の形の変数.isNotEmpty()){"Should not be empty"}
		val 商品の変数 = サービスの商品の形の変数.last()
		val 合計: 商品 = マスカラ.perform(MockMvcRequestBuilders.delete("$文章/${商品の変数.uuid}")).andExpect(status().isOk).体(地図)
		assert(!サービスの商品の変数.商品の配列を取るんです().contains(商品の変数))
	}

	@Test
	fun i_deleteByIdFail(){
		val 臨時: Any? = マスカラ.perform(MockMvcRequestBuilders.delete("$文章/${UUID.randomUUID()}")).andExpect(status().isNotFound).体(地図)
		val 合計: Boolean = 臨時 is Boolean
		assert(!合計){"Should be false"}
	}

}
