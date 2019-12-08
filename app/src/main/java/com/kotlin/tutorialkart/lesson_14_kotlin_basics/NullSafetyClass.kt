package com.kotlin.tutorialkart.lesson_14_kotlin_basics

//https://www.tutorialkart.com/kotlin/null-safety-in-kotlin/

class NullSafetyClass {
}

fun differentiateNullAndNonNull() {
    //Differentiate between nullable and non-nullable references

    var a: String = "Hello !" //the variable is declared as non-null by defult
    println("a is $a")
    // on the above example, Kotlin prevents us assign a null to a non nullable variable
    // a=null //assing null to a causes complilation error

    var b: String? = "Hi !"
    println("b is $b")
    b = null
    println("b is $b after assigning to a null")

}

fun checkForNullConditionExplicitly() {

    var b: String? = "Hello World" // variable is declared as nullable
    var bLenght = if (b != null) b.length else -1
    println("b is $b")
    println("b length equals $bLenght")

    b = null
    println("b is $b")
    bLenght = if (b != null) b.length else -1
    println("b lenght is: $bLenght")
}

fun checkWithSafeCall() {

    var b: String? = "Hello "
    var len: Int?
    len = b?.length

    println("b is $b")
    println("length is: $len")

    b = null
    len = b?.length
    println("b is $b")
    println("length is $len")
}


fun checkWithElvisOperator() {
    var b: String? = "Hello"
    var bLenth = b?.length ?: -1
    println("b is $b")
    println("b lenght is $bLenth")

    b = null
    println("b is $b")
    bLenth = b?.length ?: -1
    println("b length is: $bLenth")
}

fun checkWithNullPointerException() {
    var b: String? = "Hello"
    var bLen = b!!.length
    println("b is $b")
    println("b lenght: $bLen")

    b = null
    println("b is $b")
    //bLen = b!!.length
    println("b lenght: $bLen")

}

fun main(args: Array<String>) {

    differentiateNullAndNonNull()
    println("-----------------------")
    checkForNullConditionExplicitly()
    println("-----------------------")
    checkWithSafeCall()
    println("-----------------------")
    checkWithElvisOperator()
    println("-----------------------")
    checkWithNullPointerException()

}