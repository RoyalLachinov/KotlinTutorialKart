package com.kotlin.tutorialkart.lesson_14_kotlin_basics

//https://www.tutorialkart.com/kotlin/kotlin-inheritance/

open class PersonInheritance(var role: String = "Person", var name: String = "X") {
    fun eat(){
        println("$name is eating")
    }

    fun sleep(){
        println("$name is sleeping")
    }
}

class Programmer(name:String) : PersonInheritance("Software Engineer", name){

    fun activity(){
        println("$name is a $role. $name is not sleeping :) ")
    }

    fun doAll(){
        eat()
        sleep()
        activity()
    }
}

class Doctor(name:String):PersonInheritance("Doctor", name){
    fun activity(){
        println("$name is a $role. $name is sleeping now :) ")
    }

    fun doAll(){
        eat()
        sleep()
        activity()
    }
}

fun main(args: Array<String>) {
    var programmer= Programmer("Royal")
    var doctor = Doctor("Khadija")

    println("\n\nAbout "+programmer.name+"\n---------------")
    programmer.doAll()

    println("\n\nAbout "+doctor.name+"\n---------------")
    doctor.doAll()

}