package com.example.kotlinproject.assignment1

fun main() {
    val resultList = mutableListOf<Int>()

    for (i in 10..200) {
        if (i % 7 == 0 && i % 5 != 0) {
            resultList.add(i)
        }
    }

    println(resultList.joinToString(", "))
}