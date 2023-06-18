package com.parsrich.generalelectionmember

import mu.KotlinLogging
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication
@ConfigurationPropertiesScan
class GeneralElectionMemberApplication{
    companion object {
        val logger = KotlinLogging.logger {}
    }
}

fun main(args: Array<String>) {
    runApplication<GeneralElectionMemberApplication>(*args)
}
