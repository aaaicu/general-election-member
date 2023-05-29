package com.parsrich.generalelectionmember.domain.auth.application

import com.parsrich.generalelectionmember.domain.auth.repository.AuthRepository
import com.parsrich.generalelectionmember.infrastructure.properties.KakaoAuthInfoProperty
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.client.RestTemplate
import java.net.URI

@Service
@Transactional
class KakaoAuthService(
    val restTemplate: RestTemplate,
    val kakaoAuthInfoProperty: KakaoAuthInfoProperty,
    val authRepository: AuthRepository
) : AuthService {

    override fun <T> authorize(type: Class<T>): T? {
        authRepository.test()
        println(kakaoAuthInfoProperty.authRequestUrl)

        return restTemplate.getForObject(URI(kakaoAuthInfoProperty.authRequestUrl) , type)

    }

    override fun callback() {
        TODO("Not yet implemented")
    }
}
