package com.info.standartprogrammingstructures

import java.util.Scanner

fun main(){

    val courses = Array<String>(5){""}
    val grades = Array<Int> (5){0}

    val entry = Scanner(System.`in`)

    for (i in 0 until courses.count()){
        println("${i + 1}. course entry")
        val course = entry.next()
        courses[i] = course

        println("${i + 1}. grade entry")
        val grade = entry.nextInt()
        grades[i] = grade
    }

    var sum = 0

    for (i in 0 until courses.count()){
        println("${courses[i]} : ${grades[i]}")

        sum = sum + grades[i]
    }

    val average = sum / grades.count()
    println("Average : $average")

    if(average >= 50){
        println("PASSED.")
    }else{
        println("FAILED.")
    }
}