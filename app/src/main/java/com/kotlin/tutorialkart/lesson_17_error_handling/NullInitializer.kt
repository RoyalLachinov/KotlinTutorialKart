package com.kotlin.tutorialkart.lesson_17_error_handling

//https://www.tutorialkart.com/kotlin/null-can-not-be-a-value-of-a-non-null-type-string/

class NullInitializer {
}


fun main(args: Array<String>) {

    var name:String// variable is declared as non-null
    name = "Canada"
    println(name)

    // try assigning a null value to non-null String variable
    //name = null // this causes compilation error

    println(name)
}