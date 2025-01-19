package org.example

fun instanceOfDigits() {
    val regex = Regex("\\d+")
    val text = "I have 20 apples and 1 kiwi"
    val result = regex.replace(text, "[..]")

    println(result)
}

fun instanceOfBirthDate(){
    val regex = Regex("\\d{2}.\\d{2}.\\d{4}")
    val text = "My birth date is 11.03.2003"
    val result = regex.replace(text, "[..]")

    println(result)
}

fun instanceOfPN(){
    val regex = Regex("\\d{11}")
    val text = "Med personnummer 12345678919"
    val result = regex.replace(text, "[..]")

    println(result)
}

fun main() {
    instanceOfDigits()
    instanceOfBirthDate()
    instanceOfPN()
}