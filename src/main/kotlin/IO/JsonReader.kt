package org.example.IO

import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

fun main() {

    val url = URL("https://datacenter.taichung.gov.tw/swagger/OpenData/32e0c89c-5e29-40d3-8fd2-250584d88074")
    //Kotlin獨有
    println(url.readText())

/*

    with(url.openConnection() as HttpURLConnection) {
        inputStream.bufferedReader().lines().forEach {
            println(it)
        }
    }

*/

    /*
    val connect = url.openConnection() as HttpURLConnection
    val br = BufferedReader(InputStreamReader(connect.inputStream))
    var line = br.readLine()
    var json = StringBuffer()
    while (line != null) {
        json.append(line)
        line = br.readLine()
    }
    println(json.toString())
*/

}