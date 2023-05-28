package com.parsrich.generalelectionmember.domain.auth.application

import com.parsrich.generalelectionmember.domain.auth.repository.AuthRepository
import com.parsrich.generalelectionmember.infrastructure.constant.AuthSocialType
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class AuthService(val authRepository: AuthRepository){

    fun authorizeToSocial(authSocialType: AuthSocialType) {
        authRepository.test()
    }
}
