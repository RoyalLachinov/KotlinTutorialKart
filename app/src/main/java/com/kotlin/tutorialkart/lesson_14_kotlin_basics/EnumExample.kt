package com.kotlin.tutorialkart.lesson_14_kotlin_basics

//https://www.tutorialkart.com/kotlin/enum-classes-in-kotlin/

class EnumExample {
}

data class Mobile(val name:String, val color: MobileColor)
enum class MobileColor(val value: Int){
    GOLD(0xffd323),
    SILVER(0xeaeaea),
    WHITE(0xffffff),
    BLACK(0x000000),
    RED(0xFF0000)
}

fun main(args: Array<String>) {
    val mobile1 = Mobile("iPhone",MobileColor.BLACK)
    val mobile2 = Mobile("Samsung",MobileColor.WHITE)
    //access enum variables
    println("The color of my "+mobile1.name +" is "+mobile1.color)
    println("The color of my "+mobile2.name +" is "+mobile2.color)

    // access the value of the variable in Enum Object
    println(mobile1.color.toString()+" value is "+mobile1.color.value)
    println(mobile2.color.toString()+" value is "+mobile2.color.value)

}