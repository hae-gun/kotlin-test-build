package com.example.kotlintestbuild.concurrent

import org.springframework.data.jpa.repository.JpaRepository

interface UpdateRepository : JpaRepository<UpdateClass, Long> {
    fun findByName(name: String) : UpdateClass
    fun findByEmail(email: String) : UpdateClass
}