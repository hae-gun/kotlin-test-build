package com.example.kotlintestbuild.domain

import org.springframework.data.jpa.repository.JpaRepository

interface MyDomainRepository : JpaRepository<MyDomain, Number> {
}