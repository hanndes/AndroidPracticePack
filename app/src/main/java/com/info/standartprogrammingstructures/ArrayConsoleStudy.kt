package com.info.standartprogrammingstructures

import java.util.Scanner

fun main(){

    val entry = Scanner(System.`in`)

    val names = Array<String> (5){""}

    for (i in 0 until names.count()) { // 0,1,2,3,4
        println("${i + 1}. entry a name")
        val name = entry.next()
        names[i] = name
    }

    for ((index,name) in names.withIndex()){
        println("${index + 1}. name : $name")
    }

}