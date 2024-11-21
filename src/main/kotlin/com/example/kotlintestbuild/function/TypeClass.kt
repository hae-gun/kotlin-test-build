package com.example.kotlintestbuild.function

class TypeClass {
    fun multiply(x :Int, y: Int) = x * y
    fun multiply2(x : Int, y: Int):Int{
        return x * y
    }
    fun stringTemplate(){
        val string2 = "this is String"
        val string = "SAV $string2"
        print("SAY HELLO $string")
        val typeclass = TestClass(10, 10, 40)
        typeclass.userId3 = 3
        typeclass.makeUserId2(3)




    }


    fun asKotlinException(){

    }

    fun doSomething(number : Int){
        if(number < 0) throw RuntimeException()
    }


}