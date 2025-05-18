package com.info.standartprogrammingstructures


fun main(){

    for (i in 3..6){
        println("Loop 1 : $i")
    }

    var counter = 3

    while (counter < 7){
        println("Loop 2 : $counter")
        counter += 1
    }

    for (i in 0..8 step 2){
        println("Loop 3 : $i")
    }

    var counter1 = 0
    while (counter1 < 9){
        println("Loop 4 : $counter1")
        counter1 += 2
    }

    for (i in 8 downTo 0 step 2){
        println("Loop 5 : $i")
    }

    var counter2 = 8

    while (counter2 > -1){
        println("Loop 6 : $counter2")
        counter2 -= 2
    }
}