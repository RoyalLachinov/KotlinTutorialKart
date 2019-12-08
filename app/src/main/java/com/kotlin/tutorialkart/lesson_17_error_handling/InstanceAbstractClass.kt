package com.kotlin.tutorialkart.lesson_17_error_handling

//https://www.tutorialkart.com/kotlin/kotlin-cannot-create-instance-abstract-class/

abstract class Vechile {
    var name: String = "Not mentioned"
    abstract var age: Int

    fun printMe() {
        println("I printed")
    }

    abstract fun checkMe()

}

class InstanceAbstractClass : Vechile() {
    override var age: Int
        get() = 32
        set(value) {}

    override fun checkMe() {
        println("I checked")
    }
}

fun main(args: Array<String>) {
    var abs = InstanceAbstractClass()//Vechile() // if we use Vechile instead of InstanceAbstractClass  it will cause compilation error
    abs.printMe()
    println(abs.age)
}
