package com.kotlin.tutorialkart.lesson_14_kotlin_basics

//https://www.tutorialkart.com/kotlin/extension-functions-in-kotlin/

class ExtentionFunction {

    fun add(a:Int, b:Int){
        println("$a + $b = ${a+b}")
    }

    fun subtract(a:Int, b:Int){
        println("$a - $b = ${a-b}")
    }


}
fun ExtentionFunction.multiply(a:Int, b:Int){
    println("$a * $b = ${a*b}")
}

fun main(args: Array<String>) {
    val exFunc = ExtentionFunction()
    exFunc.add(4,5)
    exFunc.subtract(5,3)
    exFunc.multiply(5,5)
}