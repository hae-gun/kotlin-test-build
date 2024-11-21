package com.example.kotlintestbuild.function

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class TypeClassTest{
    private val typeClass : TypeClass = TypeClass()

    @Test
    fun testcase1(){
        val multiply:Int = typeClass.multiply(1, 2)
        val multiply2:Int = typeClass.multiply2(1, 2)
        assertEquals(multiply, multiply2)
    }




}