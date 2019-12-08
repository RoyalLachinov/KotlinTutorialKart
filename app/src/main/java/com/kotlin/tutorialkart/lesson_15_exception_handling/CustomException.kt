package com.kotlin.tutorialkart.lesson_15_exception_handling

import java.lang.ArithmeticException
import java.lang.Exception

//https://www.tutorialkart.com/kotlin/kotlin-custom-exception/

class CustomException() {
}

class InvalidNameException(message: String) : Exception(message)

fun validateName(name: String) {
    if (name.matches(Regex(".*\\d+.*"))) {
        throw InvalidNameException("Your name : $name : contains numerals.")
    }else{
        println("Your name is valid")
    }
}

fun main(args: Array<String>) {
    val name1 = "Tutorial 60"
    var name2 = "Royal"

    try {
        validateName(name1)
    } catch (ie: InvalidNameException) {
        println(ie.message)
    } catch (ae: ArithmeticException) {
        println(ae.message)
    }
}

