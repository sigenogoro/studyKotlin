package com.example.study.coroutine

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

suspend fun doWorld() = coroutineScope {  // this: CoroutineScope
    launch {
        delay(1000)
        println("World!")
    }
    println("Hello")
}

fun main() {
    runBlocking { doWorld() }
}