package com.kotlin.tutorialkart.lesson_14_kotlin_basics

//https://www.tutorialkart.com/kotlin/kotlin-sealed-class/

sealed class SealedArithmeticOperation

class Add(var a: Int, var b: Int) : SealedArithmeticOperation()
class Subtract(var a: Int, var b: Int) : SealedArithmeticOperation()
class Multiply(var a: Int, var b: Int) : SealedArithmeticOperation()
class Devide(var a: Int, var b: Int) : SealedArithmeticOperation()

fun execute(operation: SealedArithmeticOperation) = when (operation) {
    is Add -> println(operation.a + operation.b)
    is Subtract -> println(operation.a - operation.b)
    is Multiply -> println(operation.a + operation.b)
    is Devide -> println(operation.a / operation.b)
}

fun main(args: Array<String>) {
    val add = Add(5, 6)
    val sub = Subtract(6, 5)
    val mult = Multiply(2, 2)
    val dev = Devide(4, 2)

    execute(add)
    execute(sub)
    execute(mult)
    execute(dev)
}

