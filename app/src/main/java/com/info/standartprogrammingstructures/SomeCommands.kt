package com.info.standartprogrammingstructures

import kotlin.random.Random
import kotlin.math.*


fun main(){


    for (i in 1..10){
        val randomNumber = Random.nextInt(0,10)
        println(randomNumber)
    }

    val c = ceil(6.5)
    println("c : $c")

    val f = floor(6.5)
    println("f : $f")

    val s = sqrt(4.0)
    println("s : $s")

    val a = abs(-10)
    println("a : $a")

    val mx = max(100,200)
    val mn = min(100,200)
    println("mx : $mx")
    println("mn : $mn")

    val p = 2.0.pow(3.0)
    println("p : $p")
}