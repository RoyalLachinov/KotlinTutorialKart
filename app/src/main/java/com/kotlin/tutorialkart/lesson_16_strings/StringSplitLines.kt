package com.kotlin.tutorialkart.lesson_16_strings

import java.util.function.Consumer

//https://www.tutorialkart.com/kotlin/split-string-to-lines/

class StringSplitting {
}

fun main(args: Array<String>) {

    var str: String = "Kotlin Tutorial.\nLearn Kotlin Programming with Ease.\nLearn Kotlin Basics."
    var string: String? = null

    println(str)
    println("------------------------------")
    // splitting string using lines() function
    var lines = str.lines()
    lines.forEach { println(it) }
    println("------------------------------")
    lines.forEach(Consumer { t -> println(t) })
    println("------------------------------")
    var line = string?.lines()
    line?.forEach { t: String? -> println(t) }

}