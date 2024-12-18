package org.example.game

import java.util.*
import kotlin.random.Random

fun main() {
    val scanner = Scanner(System.`in`)
    var number = 0
    val secret = Random.nextInt(10)+1
    println(secret)

    for (i in 1..5 ){
        println("這是你猜的第${i}次")
         number = scanner.nextInt()
        if (number > secret){
            println("低一點")
        } else if (number < secret){
            println("高一點")
        } else{
            println("恭喜答對")
            break
        }

    }


}