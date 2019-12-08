package com.kotlin.tutorialkart.lesson_18_kotlin_list

//https://www.tutorialkart.com/kotlin/kotlin-list/

class CollectionsExample {
}

fun main(args: Array<String>) {
    //By default list is immutable, we can't add new item to weekDays1 list
    var weekDays1 = listOf<String>("Monday", "Tuesday")
    println(weekDays1)

    //mutablelist is mutable, changeable
    var weekDays2 = mutableListOf<String>("Monday", "Tuesday")
    println(weekDays2)
    weekDays2.add("Wednesday")
    println(weekDays2)

    var a = weekDays2.contains("Saturday")
    if (a)
        println("Saturday is present in the list")
    else
        println("Saturday is not present in the list")

    val b = weekDays2.find { s -> s.contains("nes") }
    println(b)//find() method returns the first element that satisfies the condition posed by predicate.

    val c = weekDays2.filter { s -> s.contains("es") }
    println(c)// filter method returns new list with items filtered based on the predicate.

    for (item in weekDays2) {
        print(item + " ")
    }
}