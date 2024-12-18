package org.example

fun main() {

    var list = listOf(5,1,2,7)
    println(list)

    val scores = listOf(68, 88, 77, 99, 60)
    for(score in scores) {
        println(score)
    }

    println(list.get(3))

    var mutableList = mutableListOf(5,1,2,7)
    mutableList.add(10)
    mutableList.add(1, 20)
    println(mutableList)

}