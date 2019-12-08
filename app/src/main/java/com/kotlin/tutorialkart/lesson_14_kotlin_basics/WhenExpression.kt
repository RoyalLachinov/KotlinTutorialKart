package com.kotlin.tutorialkart.lesson_14_kotlin_basics

//https://www.tutorialkart.com/kotlin/when-expression-in-kotlin/

class WhenExpression {
}

fun printWeekDay(day:Int){
    when(day){
        1 -> println("Today is Monday")
        2 -> println("Today is Tuesday")
        3 -> println("Today is Wednesday")
        4 -> println("Today is Thursday")
        5 -> println("Today is Friday")
        6 -> println("Today is Saturday")
        7 -> println("Today is Sunday")
        else -> println("Invalid value")
    }
}

fun printWeekDayAny(day:Any){
    when(day){
        1 -> println("Today is Monday")
        "TUE" -> println("Today is Tuesday")
        3 -> println("Today is Wednesday")
        4 -> println("Today is Thursday")
        "FRI" -> println("Today is Friday")
        6 -> println("Today is Saturday")
        7 -> println("Today is Sunday")
        else -> println("Invalid value")
    }
}

fun main(args: Array<String>) {
    printWeekDay(1)
    printWeekDay(2)
    printWeekDay(3)
    printWeekDay(4)
    printWeekDay(5)
    printWeekDay(6)
    printWeekDay(7)
    printWeekDay(10)

    printWeekDayAny("FRI")
    printWeekDayAny(6)
}