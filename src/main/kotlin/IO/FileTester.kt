package org.example.IO

import java.io.File

fun main() {

    //writeTest()
    File("data.txt").bufferedReader().lines().forEach {
        println(it)
    }


}

private fun writeTest() {
//    File("output.txt").writeText("asdjn,gojasildn8656")
    File("output.txt").bufferedWriter().use {
        it.write("1st line\n")
        it.write("2nd line\n")
        it.write("3rd line\n")

    }
}