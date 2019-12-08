package com.kotlin.tutorialkart.lesson_16_strings

class StringCapitalize {
}

fun main(args: Array<String>) {
    var str = "kotlin tutorials example"

    println(str)

    var listString = str.split(" ").toMutableList()

    var output = ""

    for (word in listString){
        output += word.capitalize() +" "
    }

    output = output.trim()
    println(output)
}