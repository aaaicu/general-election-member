package com.parsrich.generalelectionmember.domain.auth.application

import com.parsrich.generalelectionmember.infrastructure.constant.AuthSocialType
import org.springframework.stereotype.Component

@Component
class AuthServiceFactory(val appleAuthService: AppleAuthService, val kakaoAuthService: KakaoAuthService) {

    fun getService(authSocialType: AuthSocialType): AuthService {
        return when (authSocialType) {
            AuthSocialType.APPLE -> appleAuthService // TODO : 임시
            AuthSocialType.KAKAO -> kakaoAuthService
        }
    }
}