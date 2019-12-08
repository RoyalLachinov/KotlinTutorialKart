package com.kotlin.tutorialkart.lesson_14_kotlin_basics

//https://www.tutorialkart.com/kotlin/loops-in-kotlin-with-examples/

class ForLoopClass {
}

fun main(args: Array<String>) {
    val daysOfWeek =
        listOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    for (day in daysOfWeek) {
        print("$day ")
    }

    println()

    //Kotlin for loop example with range
    for (i in 1..5) {
        print("$i ")
    }

    println()
    //Kotlin for loop example with access index of the element in the iterable
    for ((index, day) in daysOfWeek.withIndex()){
        println("$index: $day")
    }

    //forEach
    daysOfWeek.forEach {
        print("$it ")
    }
}