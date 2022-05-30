package com.example.demo

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.ResultActions
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder

inline fun <reified T> ResultActions.体(地図: ObjectMapper = jacksonObjectMapper()):T = 地図.readValue(this.andReturn().response.contentAsByteArray)

fun MockHttpServletRequestBuilder.体(データ: Any, 地図: ObjectMapper = jacksonObjectMapper(), 種類: MediaType = MediaType.APPLICATION_JSON): MockHttpServletRequestBuilder = this.content(地図.writeValueAsBytes(データ)).contentType(種類)
