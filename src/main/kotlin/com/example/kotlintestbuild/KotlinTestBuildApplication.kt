package com.example.kotlintestbuild

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinTestBuildApplication

fun main(args: Array<String>) {
    runApplication<KotlinTestBuildApplication>(*args)
}
