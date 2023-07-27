package com.example.study.method

fun evenNumber(number: Int): Boolean {
    return number % 2 == 0
}


fun main() {
    val listNumber = listOf(0, 5, 4, 2, 7)

    val result = listNumber.filter(::evenNumber)
    // 偶数である値を出力する
    println(result)
}