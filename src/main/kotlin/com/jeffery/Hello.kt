package com.jeffery

fun main() {
//    println("Hello Kotlin")
    Human().hello()
    val h = Human()
    h.hello()

    var age : Int = 109
    age = 20;
    var weight = 66.5f
    val name = "Jeffery"
    var name1 : String
    name1 = "Jeffery2"


}

class Human {
    fun hello() {
        println("Hello kotlin")
    }
}