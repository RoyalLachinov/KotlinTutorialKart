package com.kotlin.tutorialkart.lesson_16_strings

//https://www.tutorialkart.com/kotlin/compare-strings-in-kotlin-example/

class StringComparing {
}

fun main(args: Array<String>) {
    val a = "Kotlin is easy"
    val b = "Kotlin is" + " easy"

    if (a == b)
        println("'$a' and '$b' are equal")
    else
        println("'$a' and '$b' are not equal")

    val c = "Kotlin runs oln JVM"
    if (a == b)
        println("'$a' and '$c' are equal")
    else
        println("'$a' and '$c' are not equal")

    compareStrings()
    compareStringsWithIgnoreCase()
}

//Using compareTo() extension function
fun compareStrings() {
    val a = "apple"
    val b = "apple"

    val result = a.compareTo(b)
    if (result == 0) {
        println("Strings '$a' and '$b' are equal.")
    } else if (result < 0) {
        println("String '$a' is less than '$b' lexically.")
    } else {
        println("String '$a' is great than '$b' lexically.")
    }

    val c = "banana"
    val result1 = a.compareTo(c)
    if (result1 == 0) {
        println("Strings '$a' and '$c' are equal.")
    } else if (result < 0) {
        println("String '$a' is less than '$c' lexically.")
    } else {
        println("String '$a' is great than '$c' lexically.")
    }
}

fun compareStringsWithIgnoreCase(){
    val a = "applE"
    val b = "AppLe"
    println("Ignore Case...")
    val result =  a.compareTo(b, true) // ignoreCase = true
    if (result == 0) {
        println("Strings '$a' and '$b' are equal.")
    } else if (result < 0) {
        println("String '$a' is less than '$b' lexically.")
    } else {
        println("String '$a' is great than '$b' lexically.")
    }

}