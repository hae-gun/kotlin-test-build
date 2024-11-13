package com.example.kotlintestbuild.domain

import org.springframework.stereotype.Service

@Service
class MyService(
    val repository: MyDomainRepository
) {
    fun myShowDomain(): MyDomain = MyDomain(1000, "hello", "hello@namver.com")
    fun getMyDomains(): List<MyDomain> = repository.findAll()
}