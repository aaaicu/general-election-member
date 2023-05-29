package com.parsrich.generalelectionmember.ui.auth.controller

import com.parsrich.generalelectionmember.domain.auth.application.AuthService
import com.parsrich.generalelectionmember.infrastructure.constant.AuthSocialType
import com.parsrich.generalelectionmember.infrastructure.constant.EndPoint
import com.parsrich.generalelectionmember.ui.auth.dto.KakaoLoginResponseDTO
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping(EndPoint.AUTH)
@RestController
class AuthController(val authService: AuthService) {

    @GetMapping("/{authSocialType}")
    fun authorize(@PathVariable authSocialType: String): ResponseEntity<KakaoLoginResponseDTO> {
        authService.authorizeToSocial(AuthSocialType.KAKAO)


        return ResponseEntity.ok().build()
    }
}