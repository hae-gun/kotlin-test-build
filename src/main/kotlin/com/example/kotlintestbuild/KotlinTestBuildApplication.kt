package com.example.kotlintestbuild

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication
class KotlinTestBuildApplication

fun main(args: Array<String>) {
    runApplication<KotlinTestBuildApplication>(*args)
}
