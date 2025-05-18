package com.info.standartprogrammingstructures

fun main() {

    var age = 19
    var name = "Ahmet"

    if (age >= 18) {
        println("You are adult!")
    }

    if (age >= 18) {
        println("You are adult!")
    } else {
        println("You are NOT adult!")
    }

    if (name == "Ahmet") {
        println("Hello, Ahmet!")
    } else {
        println("You are stranger!")
    }

    if (name == "Ahmet") {
        println("Hello, Ahmet!")
    } else if (name == "Mehmet") {
        println("Hello, Mehmet!")
    } else {
        println("You are stranger!")
    }

    var userName = "admin"
    var password = 12345

    if (userName == "admin" && password == 12345) {
        println("Welcome!")
    } else {
        println("Incorrect entry")
    }

    var grade = 8

    if(grade == 9 || grade == 10 || grade == 11 || grade == 12){
        println("You can prepare for the exam.")
    }

    var a = 10
    var b = 10
    if ( a == b ) println("Equal") else println("NOT equal")
}