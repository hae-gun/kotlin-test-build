package com.example.kotlintestbuild.function

class TestClass (
    userId : Long,
    var userId3 : Long,
    private var userId4 : Long
    )
{
    var userId2 = 1L
        private set
    fun makeUserId2(number: Long){
        userId2 = number
    }
}