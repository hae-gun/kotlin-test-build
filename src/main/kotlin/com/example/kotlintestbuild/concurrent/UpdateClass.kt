package com.example.kotlintestbuild.concurrent

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class UpdateClass (
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id : Long,
    var name: String ,
    var email: String
){
}