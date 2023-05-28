package com.parsrich.generalelectionmember.infrastructure.properties

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "auth-info.kakao")
data class KakaoAuthInfoProperty(
    val host: String,
    val apiKey: String,
    val redirectUri: String,
    val authRequestUrl: String,
    val tokenRequestUrl: String
)
