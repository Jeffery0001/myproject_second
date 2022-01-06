package com.jeffery

fun main() {
//    println("Hello Kotlin")
    Human().hello()
    val p = Human()
    p.hello()
}

class Human {
    fun hello() {
        println("Hello kotlin")
    }
}