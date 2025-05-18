package com.info.standartprogrammingstructures

import java.util.Scanner

fun main(){

    val entry = Scanner(System.`in`)

    while (true){

        println("Enter the number.")

        val number = entry.nextInt()

        val result = number % 2

        if(result == 0){
            println("EVEN number.")
        }
        if(result == 1){
            println("ODD number.")
        }
        println("1 to exit, other numbers to continue.")
        val exit =entry.nextInt()

        if(exit == 1){
            println("Exited.")
            break
        }
    }
}