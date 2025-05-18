package com.info.standartprogrammingstructures

import java.util.Scanner

fun main(){

    val entry = Scanner(System.`in`)

    println("Enter the amount of data to be processed.")

    var data = entry.nextInt()

    while(data > 0){
        println("$data. data")
        data -= 1
    }
}