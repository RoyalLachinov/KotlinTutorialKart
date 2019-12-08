package com.kotlin.tutorialkart.lesson_17_error_handling

//https://www.tutorialkart.com/kotlin/kotlin-compilation-error-variable-must-be-initialized/

class VariableNotInitialized {
}

fun main(args: Array<String>) {
    var name:String = ""// If we do not initialize the name string then we will get compilation error
    name.length

    var names: ArrayList<String> = ArrayList() // If we do not initialize the arrayList then we will get compilation error
    names.add("Vancouver")
    names.add("Toronto")

    println(names[0])
}