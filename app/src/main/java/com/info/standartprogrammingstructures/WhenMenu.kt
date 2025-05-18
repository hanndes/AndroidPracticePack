package com.info.standartprogrammingstructures

import java.util.Scanner

fun main(){
    val entry = Scanner(System.`in`)

    println("Delete (1)")
    println("Add (2)")

    val choose = entry.nextInt()

    when(choose){
        1 -> println("Data deleted.")
        2 -> println("Data added.")
        else -> println("Invalid transaction.")
    }
}