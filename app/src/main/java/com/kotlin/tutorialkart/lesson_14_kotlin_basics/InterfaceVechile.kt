package com.kotlin.tutorialkart.lesson_14_kotlin_basics

//https://www.tutorialkart.com/kotlin/kotlin-interfaces/
interface InterfaceVechile {
    var name: String
    var medim: String

    fun runsWhere() {
        println("The vechile, $name, runs in $medim")
    }

    fun howItRuns()
}

class AeroPlaneImpl : InterfaceVechile {
    override var name: String
        get() = "Aerobus"
        set(value) {}

    override var medim: String
        get() = "air"
        set(value) {}

    override fun howItRuns() {
        println("The $name, runs in $medim")
    }
}

fun main(args: Array<String>) {
    var aeroPlane:AeroPlaneImpl = AeroPlaneImpl()
    aeroPlane.howItRuns()
    aeroPlane.runsWhere()
}