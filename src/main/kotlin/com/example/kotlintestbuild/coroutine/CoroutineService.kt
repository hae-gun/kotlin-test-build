package com.example.kotlintestbuild.coroutine

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.springframework.stereotype.Service

@Service
class CoroutineService {

    suspend fun doWorld() : String{
        delay(1000000)
        return "hello"
    }
    fun getString(word : String) = word
}