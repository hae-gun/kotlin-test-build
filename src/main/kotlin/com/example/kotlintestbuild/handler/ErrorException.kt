package com.example.kotlintestbuild.handler

import org.springframework.http.HttpStatus

data class ErrorException(
    val status_code: HttpStatus,
    val message:String
)
