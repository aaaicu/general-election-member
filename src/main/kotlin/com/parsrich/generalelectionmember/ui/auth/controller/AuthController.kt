package com.parsrich.generalelectionmember.ui.auth.controller

import com.parsrich.generalelectionmember.domain.auth.application.AuthService
import com.parsrich.generalelectionmember.infrastructure.constant.EndPoint
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping(EndPoint.AUTH)
@RestController
class AuthController(val authService: AuthService) {

    @PostMapping("/test")
    fun test(): ResponseEntity<Void> {
        authService.test()
        return ResponseEntity.ok().build()
    }

    @GetMapping("/hello")
    fun hello(): String {
        return "Hello, World!"
    }
}