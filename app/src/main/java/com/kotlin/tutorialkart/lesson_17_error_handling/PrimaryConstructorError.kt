package com.kotlin.tutorialkart.lesson_17_error_handling

//https://www.tutorialkart.com/kotlin/handle-kotlin-compilation-error-primary-constructor-call-expected/


class PrimaryConstructorError(var name:String) {

    var age  = 23;
    constructor(name: String, age:Int):this(name){//if we take out this(name) it will cause compilation error
        this.age = age
    }

    fun printMessage(){
        println("Name is $name and age is $age")
    }
}

fun main(args: Array<String>) {
    val primaryConstructorError = PrimaryConstructorError("Royal", 32)
    primaryConstructorError.printMessage()

}