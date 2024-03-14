package com.example.kotlinproject.assignment1

fun main() {
    var n: Int
    while (true) {
        println("Enter number of the array:")
        val input = readLine()
        try {
            n = input!!.toInt()
            if (n <= 0) {
                println("Invalid input")
            } else {
                break
            }
        } catch (e: NumberFormatException) {
            println("Invalid input")
        }
    }

    var array = IntArray(n)

    for (i in 0 until n) {
        while (true) {
            print("Element $i: ")
            val elementInput = readLine()
            try {
                array[i] = elementInput!!.toInt()
                break
            } catch (e: NumberFormatException) {
                println("Invalid input")
            }
        }
    }

    for (i in 0 until n - 1) {
        for (j in i + 1 until n) {
            if (array[i] > array[j]) {
                val temp = array[i]
                array[i] = array[j]
                array[j] = temp
            }
        }
    }

    println("The array:")
    for (element in array) {
        print("$element ")
    }
}
