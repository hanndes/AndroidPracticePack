package com.info.standartprogrammingstructures

fun main(){

    for (i in 3..5){
        println(i)
    }

    var start = 10
    var end = 20
    var step = 5
    for (a in start..end step step){
        println("a : $a")

    }

    for (b in end downTo start step step){
        println("b : $b")
    }

    for (c in 1 until 5 ){ // 5 not included.
        println("c : $c")
    }

    var counter= 1

    while(counter < 4){
        println("counter : $counter")
        counter += 1
    }

}