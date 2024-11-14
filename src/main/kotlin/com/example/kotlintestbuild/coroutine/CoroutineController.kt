package com.example.kotlintestbuild.coroutine

import kotlinx.coroutines.delay
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CoroutineController (val coroutineService:CoroutineService) {

    @GetMapping("/suspend")
    suspend fun suspending() : String{
        val start = System.currentTimeMillis()
        delay(100)
        val end = System.currentTimeMillis()
        return "hello ${end-start}"
    }
}