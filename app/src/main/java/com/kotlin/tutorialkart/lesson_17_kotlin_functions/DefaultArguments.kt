package com.kotlin.tutorialkart.lesson_17_kotlin_functions

class DefaultArguments {
}


/**
 * add function with parameters a, b
 * a : default argument is 1
 * b : default argument is 1
 */

//Example – Kotlin Default Arguments
fun addDefaultArguments(a: Int = 1, b: Int = 1):Int {
    return a + b
}


/**
 * add function with two, three or four integer arguments
 * c : default argument is 0
 * d : default argument is 0
 */
fun addMixDefaultArguments(a:Int, b:Int, c:Int = 0, d:Int = 0): Int {
    return a + b + c + d
}

fun main(args: Array<String>) {

    print("With Default Arguments")
    // function call with arguments
    var sum1 = addDefaultArguments(5,6)
    println(sum1)

    println("------------------")

    // function call with no arguments
    var sum2 = addDefaultArguments()
    println(sum2)

    println("------------------\nWith Mix of Default Arguments")

    val sum3 = addMixDefaultArguments(5, 6)
    val sum4 = addMixDefaultArguments(5, 6, 7)
    val sum5 = addMixDefaultArguments(5, 6, 7, 8)
    println(sum3)
    println(sum4)
    println(sum5)


}