package com.kotlin.tutorialkart.lesson_18_kotlin_list

import java.util.function.Consumer

//https://www.tutorialkart.com/kotlin/kotlin-list-foreach-example/

class ListForEach {
}

data class Book(var name: String, val price: Int = 0)

fun main(args: Array<String>) {
    var weekDays =
        listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    weekDays.forEach(Consumer { t ->
        print(t + " ")
    })
    println()
    weekDays.forEach {
        print(it + " ")
    }

    val book1 = Book("Khamsa")
    val book2 = Book("White woman", 20)

    println()

    val listOfBook = listOf<Book>(book1, book2)
    listOfBook.forEach {
        println("price of book, ${it.name} is ${it.price}")
    }
}