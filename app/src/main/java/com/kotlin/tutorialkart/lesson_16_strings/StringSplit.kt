package com.kotlin.tutorialkart.lesson_16_strings

//https://www.tutorialkart.com/kotlin/kotlin-split-string/

class StringSplit {
}

fun main(args: Array<String>) {
    var str1 =
        "IsepStratedseplearning KotlinsepalsosepIseptransferedsepmysepcompanysepproject into Kotlin"
    var delimitedString1 = str1.split("sep")
    println(delimitedString1)
    println(delimitedString1.toString().replace(",", ""))
    println("--------------------------------")
    var str2 = "Kotinasapissepvery niceasaplanguage"
    println(str2.split("asap", "sep").toString().replace(",", ""))
    println("--------------------------------")
    var str3 = "IAsaploveasapKotlin"
    println(str3.split("asap",ignoreCase = false))
    println("--------------------------------")
    println(str3.split("asap",ignoreCase = true).toString().replace(",",""))

    //Example – Split String using Regular Expression
    var str = "Kotlin TutorialsepTutorialasepKartsepExamples"
    var parts = str.split(Regex("sep|asep"))
    println(parts)
}