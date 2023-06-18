package com.parsrich.generalelectionmember.ui.auth.controller

import com.parsrich.generalelectionmember.GeneralElectionMemberApplication.Companion.logger
import com.parsrich.generalelectionmember.domain.auth.application.AuthServiceFactory
import com.parsrich.generalelectionmember.infrastructure.constant.AuthSocialType
import com.parsrich.generalelectionmember.infrastructure.constant.EndPoint
import com.parsrich.generalelectionmember.ui.auth.dto.KakaoLoginResponseDTO
import org.springframework.http.HttpHeaders
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*

@RequestMapping(EndPoint.AUTH)
@RestController
class AuthController(val authServiceFactory: AuthServiceFactory) {

    @GetMapping("/{authSocialType}")
    fun authorize(@PathVariable authSocialType: Optional<AuthSocialType>): ResponseEntity<String> {
        val service = authServiceFactory.getService(authSocialType.get())
        val authorize = service.authorize(String::class.java)
        println("authorize = $authorize")

        val responseHeaders = HttpHeaders()
        responseHeaders.add("Content-type", "text/html; charset=UTF-8")

        return ResponseEntity.ok().headers(responseHeaders).body(authorize)
    }

    @GetMapping("/{authSocialType}/callback")
    fun callback(@PathVariable authSocialType: Optional<AuthSocialType>, @RequestParam code: String): ResponseEntity<KakaoLoginResponseDTO> {
        logger.info("정상 로그: $code")

        val service = authServiceFactory.getService(authSocialType.get())
        service.callback()

        return ResponseEntity.ok().build()
    }
}