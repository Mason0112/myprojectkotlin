package org.example.game

import java.util.Random
import java.util.Scanner

fun main() {
//    val scanner = Scanner(System.`in`)
    val secret = Random().nextInt(10)+1
    println(secret)
    var number = 0
    while (number != secret){
        println("Please enter a number:")
//        number = scanner.nextInt()
        number = readLine()!!.toInt()
        if (number > secret){
            println("lower")
        } else if (number < secret){
            println("higher")
        } else{
            println("Great, the number is $number")
        }

    }




}