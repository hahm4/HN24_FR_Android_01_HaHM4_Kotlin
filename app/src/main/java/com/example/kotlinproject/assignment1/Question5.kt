package com.example.kotlinproject.assignment1

import java.util.*

fun main() {
    var isValidInput = false
    var month = 0
    var year = 0

    val scanner = Scanner(System.`in`)

    while (!isValidInput) {
        print("Enter month (1-12): ")
        if (scanner.hasNextInt()) {
            month = scanner.nextInt()
            if (month in 1..12) {
                isValidInput = true
            } else {
                println("Invalid input")
            }
        } else {
            println("Invalid input")
            scanner.next()
        }
    }

    isValidInput = false
    while (!isValidInput) {
        print("Enter year: ")
        if (scanner.hasNextInt()) {
            year = scanner.nextInt()
            if (year >= 0) {
                isValidInput = true
            } else {
                println("Invalid input")
            }
        } else {
            println("Invalid input")
            scanner.next()
        }
    }

    val calendar = Calendar.getInstance()
    calendar.set(Calendar.MONTH, month - 1)
    calendar.set(Calendar.YEAR, year)

    val daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH)
    println("Number of days in $month/$year is: $daysInMonth")
}
