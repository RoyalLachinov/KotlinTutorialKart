package com.kotlin.tutorialkart.lesson_14_kotlin_basics

abstract class AbstractVechile {

    //regular variable
    var name:String = "Not mentioned"

    //abstract variable
    abstract var medium:String

    //regular function
    fun runsEveryWhere(){
        println("The vechile, $name runs on $medium")
    }

    //abstract funtion
    abstract fun howItRuns()

}

//https://www.tutorialkart.com/kotlin/kotlin-abstract-class/
class AeroPlane:AbstractVechile(){


    override var medium: String
        get() = "air"
        set(value) {}

    override fun howItRuns() {
        println("Aeroplane fly based on buoyancy force.")
    }


}

fun main(args: Array<String>) {
    var vechile1 = AeroPlane()
    vechile1.name = "Airplane "
    vechile1.howItRuns()
    vechile1.runsEveryWhere()
}