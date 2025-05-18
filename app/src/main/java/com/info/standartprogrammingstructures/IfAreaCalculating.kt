package com.info.standartprogrammingstructures

import java.util.*

fun main() {

    val entry = Scanner(System.`in`)
    println("Rectangle Area (1)")
    println("Circle Area (2)")

    val choose = entry.nextInt()

    println("Your choose : $choose")

    if (choose == 1) {
        println("Enter short side")
        val shortSide = entry.nextInt()
        println("Enter long side")
        val longSide = entry.nextInt()

        println("Rectangle Area")
        val recArea = shortSide * longSide
        println("Result : $recArea")
    }
    if (choose == 2) {
        println("Enter a radius")
        val radius = entry.nextInt()
        println("Circle Area")
        val circArea = 3.14 * radius * radius
        println("Result : $circArea")
    }

}