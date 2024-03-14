package com.example.kotlinproject.assignment1

import kotlin.math.*

fun main() {
    var number: Int? = null

    while (number == null || number !in 10..99) {
        println("Enter integer number has 2 digits:")
        number = readLine()?.toIntOrNull()

        if (number == null || number !in 10..99) {
            println("Invalid input.")
        }
    }


    val binary = Integer.toBinaryString(number)
    val hexadecimal = Integer.toHexString(number)
    println("$number in binary is: $binary")
    println("$number in hexadecimal is: $hexadecimal")

}
