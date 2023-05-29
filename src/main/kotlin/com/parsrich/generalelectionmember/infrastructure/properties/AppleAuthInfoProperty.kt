package com.parsrich.generalelectionmember.infrastructure.properties

import org.springframework.boot.context.properties.ConfigurationProperties

//TODO 임시
@ConfigurationProperties(prefix = "auth-info.apple")
data class AppleAuthInfoProperty(
    val host: String
//    val apiKey: String,
//    val redirectUri: String,
//    val authRequestUrl: String,
//    val tokenRequestUrl: String
)
