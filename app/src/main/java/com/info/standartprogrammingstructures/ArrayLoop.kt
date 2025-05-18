package com.info.standartprogrammingstructures

fun main(){

    val fruits = arrayOf<String>("Strawberry","Banana","Apple","Kiwi","Cherry")

    for (fruit in fruits){
        println("Result : $fruit")
    }

    for ((index,fruit) in  fruits.withIndex()){
        println("Result $index : $fruit")
    }
}