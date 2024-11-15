package com.example.kotlintestbuild.function

class TypeClass {
    private fun multiply(x :Int, y: Int) = x * y
    private fun multiply2(x : Int, y: Int):Int{
        return x * y
    }
    fun main(){
        val multiply:Int = multiply(1, 2)
        val multiply2:Int = multiply2(1, 2)
    }
}