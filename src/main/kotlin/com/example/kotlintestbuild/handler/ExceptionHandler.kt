package com.example.kotlintestbuild.handler

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

@ControllerAdvice
class ExceptionHandler {

    @ExceptionHandler(Exception::class)
    fun handleGeneralException(ex: Exception): ResponseEntity<ErrorException> {
        return ResponseEntity(ErrorException(HttpStatus.INTERNAL_SERVER_ERROR, "An error occurred: ${ex.message}"), HttpStatus.INTERNAL_SERVER_ERROR)
    }
}