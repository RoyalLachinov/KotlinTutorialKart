package com.kotlin.tutorialkart.lesson_14_kotlin_basics

//https://www.tutorialkart.com/kotlin/classes-and-constructors-in-kotlin/

//The default visibility of primary constructor is public.
// we can remove the costurctor keyword from primary consturctor
class KotlinConstructor constructor(var name: String, var age: Int) {

    var profession = "Not Mentionded"

    //The default visibility of secondary constructor is public.
    constructor(name: String, age: Int, profession: String) : this(name, age) {
        this.profession = profession
        println("Hello from Secondary constructor")
    }

    init {
        println("Hello from init block and Instructions in the init block are executed right after Primary Constructor’s execution")
    }

    init{
        println("$name's details are being held in this class object. init ")
    }

    fun printPersonDetail() {
        println("$name whose profession is $profession and age is $age")
    }
/*
    If you observe the definition of primary constructor, there is no provision in the header
    to include some lines code for the primary constructor, except for the declaration of type variables.
    To fill this void, there is init block. Initializer block is run during the initialization of class object,
    before executing each constructor and the role of init block in aiding primary constructor.

    */
}

fun main(args: Array<String>) {
    var person1 = KotlinConstructor("Royal",32)
    person1.printPersonDetail()
    var person2 = KotlinConstructor("Khadija",7,"Doctor")
    person2.printPersonDetail()
}