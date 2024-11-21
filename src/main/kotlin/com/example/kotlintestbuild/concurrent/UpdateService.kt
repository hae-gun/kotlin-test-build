package com.example.kotlintestbuild.concurrent

interface UpdateService {
    fun updateDomainName(id: Long, name: String) : UpdateClass
    fun updateDomainEmail(id: Long, email: String) : UpdateClass
    fun getDomainData(id: Long) : UpdateClass
    fun enrollDomains(id: Long, name: String, email: String) : UpdateClass
}