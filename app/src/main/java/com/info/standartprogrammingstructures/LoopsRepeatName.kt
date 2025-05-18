package com.info.standartprogrammingstructures

import java.util.Scanner

fun main(){

    val entry = Scanner(System.`in`)
    println("Enter your name")

    val name = entry.next()
    println("Enter the number of repetitions")

    val repeat = entry.nextInt()

    for(i in 1..repeat){
        println("$i. $name")
    }
}