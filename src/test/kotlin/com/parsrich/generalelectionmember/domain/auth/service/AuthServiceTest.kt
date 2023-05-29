package com.parsrich.generalelectionmember.domain.auth.service

import com.parsrich.generalelectionmember.domain.auth.application.KakaoAuthService
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.transaction.annotation.Transactional

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Transactional
internal class AuthServiceTest() {

    @Autowired
    lateinit var kakaoAuthService: KakaoAuthService

    @Test
    @DisplayName("테스트")
    fun healthCheck() {
//        authService.authorizeToSocial(authSocialType)
    }
}