package com.info.standartprogrammingstructures

fun main(){
    val arr1 = Array<Int>(5){0}
    val arr2 = arrayOf(1,10,7)
    val arr3 = arrayOf<Int>(1,36,9)
    val arr4 = arrayOf<String>("Strawberry","Apple")
    val arr5 = arrayOf(3,8,"Banana","Chicago")
    val fruits = arrayOf<String>("Strawberry","Banana","Apple","Kiwi","Cherry")

    //Data access

    val str1 = fruits[2]
    println(str1)

    val str2 = fruits.get(3)
    println(str2)

    //Data process

    fruits[1] = "New Banana"
    println(fruits.contentToString())

    fruits.set(2,"New Apple")
    println(fruits.contentToString())

    //Array process

    println(fruits.isEmpty())

    println(fruits.count())

    println(fruits.first())

    println(fruits.last())

    println(fruits.indexOf("Kiwi"))

    println(fruits.contains("Banana"))

    println(fruits.max())

    println(fruits.min())

    println(fruits.sort())

    println(fruits.contentToString())

    println(fruits.reverse())

    println(fruits.contentToString())
}