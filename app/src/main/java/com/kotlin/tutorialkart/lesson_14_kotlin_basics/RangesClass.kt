package com.kotlin.tutorialkart.lesson_14_kotlin_basics

//https://www.tutorialkart.com/kotlin/kotlin-ranges/

class RangesClass {
}

fun main(args: Array<String>) {
    for (i in 1..10) {
        print("$i ")
    }
    println()
    for (i in 1..10 step 2) {
        print("$i ")
    }
    println()
    for (i in 10 downTo 5){
        print("$i ")
    }
    println()
    for (i in 1 until 20 step 4){
        print("$i ")
    }
    println()
    for (i in 30 downTo 1 step 6){
        print("$i ")
    }
}