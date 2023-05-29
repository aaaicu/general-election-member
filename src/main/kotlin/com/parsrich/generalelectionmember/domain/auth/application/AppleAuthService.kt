package com.parsrich.generalelectionmember.domain.auth.application

import com.parsrich.generalelectionmember.domain.auth.repository.AuthRepository
import com.parsrich.generalelectionmember.infrastructure.properties.AppleAuthInfoProperty
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class AppleAuthService(val appleAuthInfoProperty: AppleAuthInfoProperty, val authRepository: AuthRepository) :
    AuthService {

    override fun <T> authorize(type: Class<T>): T? {
        println(appleAuthInfoProperty.host)
        TODO("Not yet implemented")
    }

    override fun callback() {
        TODO("Not yet implemented")
    }
}
