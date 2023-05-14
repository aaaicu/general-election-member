package com.parsrich.generalelectionmember.domain.auth.application

import com.parsrich.generalelectionmember.domain.auth.repository.AuthRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class AuthService(val authRepository: AuthRepository){

    fun test() {
        authRepository.test()
    }
}
