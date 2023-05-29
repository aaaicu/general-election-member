package com.parsrich.generalelectionmember.domain.auth.application

interface AuthService {
    fun <T> authorize(type: Class<T>): T?
    fun callback()
}