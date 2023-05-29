package com.parsrich.generalelectionmember.infrastructure.exception

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException

@ControllerAdvice
class TypeMismatchExceptionHandler {
    @ExceptionHandler(value = [MethodArgumentTypeMismatchException::class])
    fun handleMethodArgumentTypeMismatchException(ex: RuntimeException): ResponseEntity<Void> {
        return ResponseEntity.notFound().build()
    }
}