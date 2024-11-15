package com.example.kotlintestbuild.coroutine

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlinx.coroutines.test.runTest
import kotlin.test.assertTrue

fun String.shouldBeEqualTo(expected: String) {
    assertEquals(expected, this)
}
fun Long.shouldBeEqualTo(expected: Long){
    assertEquals(expected, this)
}
fun Long.betterThan(compare: Long){
    assertTrue { this - compare > 1000}
}

class CoroutineControllerTest(){

    @Test
    fun call_method(){
        val myFunction = CoroutineService()
        val wantStr = "iwant"
        val funcStr = myFunction.getString(wantStr)
        funcStr.shouldBeEqualTo(wantStr)
    }
    @Test
    fun testCoroutineFunction() = runTest{
        val myFunction = CoroutineService()
        val time = System.currentTimeMillis()
        val doWorld = myFunction.doWorld()
        val time2 = System.currentTimeMillis()
        time2.betterThan(time)
        doWorld.shouldBeEqualTo("hello")
    }

    @Test
    fun whenTest() {
        val myFunction = CoroutineService()
        assertEquals("Number", myFunction.checkWhen(1))
        assertEquals("else", myFunction.checkWhen(-1))
    }
}


