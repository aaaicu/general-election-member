package com.parsrich.generalelectionmember

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication
@ConfigurationPropertiesScan
class GeneralElectionMemberApplication

fun main(args: Array<String>) {
    runApplication<GeneralElectionMemberApplication>(*args)
}
