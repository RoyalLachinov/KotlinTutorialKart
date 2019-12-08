package com.kotlin.tutorialkart.lesson_15_exception_handling

import java.lang.ArithmeticException
import java.lang.Exception
import java.lang.NullPointerException

//https://www.tutorialkart.com/kotlin/kotlin-try-catch/
class TryCatchClass {
}

fun main(args: Array<String>) {
    val a: Int = 5
    val b: Int = 0

    var c: Int

    try {
        c = a / b
    } catch (e: ArithmeticException) {
        println("a is $a and b is $b. a/b ?? You cannot divide something with zero.")
        println(e.message)
    }

    val balance = 200
    try {
        validateBalance(balance)
    } catch (e: Exception) {
        print(e.message)
    }
}

fun validateBalance(amount: Int) {
    if(amount < 1000)
    throw MinumumBalanceException("Your balance $amount is less than minumum balance")
    else
        println("Your balance activated")
}

class MinumumBalanceException(message:String):Exception(message)