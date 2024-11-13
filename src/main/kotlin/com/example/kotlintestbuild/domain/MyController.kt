package com.example.kotlintestbuild.domain

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1")
class MyController(
    val service: MyService
) {
    @GetMapping("/hello")
    fun hello(): ResponseEntity<MyDomain?> = ResponseEntity.ok(service.myShowDomain())

    @GetMapping("/all")
    fun getAll() = ResponseEntity.ok(service.getMyDomains())


}