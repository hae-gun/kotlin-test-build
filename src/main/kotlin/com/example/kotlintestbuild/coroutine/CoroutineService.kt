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

    fun checkWhen(inputInt : Number): String{
        when(inputInt){
            0,1,2,3,4,5,6,7,8,9,10 -> return "Number"
            else -> return "else"
        }
    }

}