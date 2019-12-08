package com.kotlin.tutorialkart.lesson_14_kotlin_basics

//https://www.tutorialkart.com/kotlin/data-class-in-kotlin/

data class UserDataClass(val name: String, val age: Int)

fun printUserDetails(user: UserDataClass) {
    println(user.name + " " + user.age)
}

fun main(args: Array<String>) {
    val userDataClass1 = UserDataClass("Royal", 32)
    printUserDetails(userDataClass1)
    val userDataClass2 = UserDataClass("Turkan", 26)
    val userDataClass3 = UserDataClass("Khadija", 7)
/*
    Kotlin allows copying an existing data class object to a new variable as is
    or with modifications to some of the parameters of Data Class.
        */
    val userDataClass4 = userDataClass3.copy("Muhammed")
    val userDataClass5 = userDataClass4.copy("Erkin", 1)

    val listOfDataClass = ArrayList<UserDataClass>();
    listOfDataClass.add(userDataClass1)
    listOfDataClass.add(userDataClass2)
    listOfDataClass.add(userDataClass3)
    listOfDataClass.add(userDataClass4)
    listOfDataClass.add(userDataClass5)

    for (i in listOfDataClass)
        println(i)

    //To access individual properties of a data class, component functions are used.
    val name = userDataClass1.component1()
    val age = userDataClass1.component2()
    println("Name is $name and age is $age")

}