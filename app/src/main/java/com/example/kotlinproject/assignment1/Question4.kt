package com.example.kotlinproject.assignment1

fun main() {
    println("Enter string:")
    val inputString = readLine() ?: ""

    val wordsCount = countWords(inputString)
    val modifiedString = capitalizeFirstLetterOfSentence(inputString)

    println("Number of words in string is: $wordsCount")
    println("New String: ")
    println(modifiedString)
}

fun countWords(input: String): Int {
    val words = input.split("\\s+".toRegex())
    return words.count { it.isNotBlank() }
}

fun capitalizeFirstLetterOfSentence(input: String): String {
    val sentences = input.split("(?<=[.!?])".toRegex())
    val modifiedSentences = mutableListOf<String>()

    for (sentence in sentences) {
        if (sentence.isNotBlank()) {
            val modifiedSentence = sentence.trim().replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() }
            modifiedSentences.add(modifiedSentence)
        }
    }

    return modifiedSentences.joinToString("")
}