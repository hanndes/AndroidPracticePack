package com.info.standartprogrammingstructures

import java.util.*

fun main() {

    val entry = Scanner(System.`in`)

    println("Addition (1)")
    println("Substraction (2)")
    println("Multiplication (3)")
    println("Division (4)")

    val choose = entry.nextInt()

    println("Enter the first number")
    val num1 = entry.nextInt()
    println("Enter the second number")
    val num2 = entry.nextInt()

    when (choose) {
        1 -> println("Addition : ${num1 + num2}")
        2 -> println("Substraction : ${num1 - num2}")
        3 -> println("Multiplication : ${num1 * num2}")
        4 -> println("Division : ${num1 / num2}")
        else -> println("Invalid transaction")
    }
}