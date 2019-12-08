package com.kotlin.tutorialkart.lesson_14_kotlin_basics

//https://www.tutorialkart.com/kotlin/kotlin-while-loop-do-while-loop/

class WhileLoopClass {
}

fun main(args: Array<String>) {
    var x = 5;

    while (x >= 1) {
        print("$x ")
        x--
    }

    println()

    var y = 10
    while (y >= 1) {
        print("$y ")
        y--
        if (y == 3) {
            break
        }
    }

    println()

    var z = 10
    while (z >= 1) {
        z--
        if (z == 5)
            continue
        print("$z ")

    }

    println()
    var c = 10
    do {
        print("$c ")
        c--
    }while (c >= 0)
}