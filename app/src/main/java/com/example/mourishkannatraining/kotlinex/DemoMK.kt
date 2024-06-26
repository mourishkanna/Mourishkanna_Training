package com.example.mourishkannatraining.kotlinex

var lamda : (Int) -> Int = { a -> a*a}

fun operation(): (Int) -> Int {                                     // 1
    // return lamda
    return ::square
}

fun square(x: Int) = x * x                                          // 2

fun main() {
    val func = operation()                                          // 3
    println(func(2))                                                // 4
}