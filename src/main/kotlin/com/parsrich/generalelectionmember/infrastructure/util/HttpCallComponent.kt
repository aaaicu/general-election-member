package com.parsrich.generalelectionmember.infrastructure.util

import org.springframework.http.MediaType
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate

@Component
class HttpCallComponent(val restTemplate: RestTemplate) {

}