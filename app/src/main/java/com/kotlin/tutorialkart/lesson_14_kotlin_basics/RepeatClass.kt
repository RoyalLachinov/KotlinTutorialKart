package com.kotlin.tutorialkart.lesson_14_kotlin_basics

//https://www.tutorialkart.com/kotlin/kotlin-repeat/

class RepeatClass {
}

fun main(args: Array<String>) {
    repeat(10){
        print("$it ")
    }

    println()
    repeat(10){
        println("Hello ")
    }
}