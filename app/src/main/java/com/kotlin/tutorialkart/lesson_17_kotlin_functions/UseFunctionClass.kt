package com.kotlin.tutorialkart.lesson_17_kotlin_functions

import java.io.File

class UseFunctionClass {
}

fun main(args: Array<String>) {
    val file = File("D:" + File.separator + "shipping_acount.txt")
    file.bufferedReader().use {
        println(it.readText())
    }
}