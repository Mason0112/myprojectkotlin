package org.example.ticket

import java.util.*


data  class Ticket(val origin:Int, val destination:Int, val price:Int){

}

fun main() {
    var ticket = Ticket(20, 51, 420)
    val s = "dadasdasdad"
    println(s.validate())
    val s1 = "aaa"
    println(s1.validate())
    println((1..20).random())



}

//擴充方法
fun String.validate():Boolean{
    return this.length >= 6
}

//擴充Range ex.(1..10)
fun IntRange.random() : Int{
    val r = Random().nextInt(endInclusive - start) + start
    return r
}



