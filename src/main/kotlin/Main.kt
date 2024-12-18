package org.example

import org.example.Student.Student
import javax.naming.Name

fun main() {
//    println("Hello World!")
//    Person().Hello();

    val student = Student("Mason", 60, 99)
    student.grading()


    val p =Person(weight = 66.5f, height = 1.7f)
    p.hello()
    println(p.bmi())
    var age = 19
    age = 20
    var weight = 66.5;//沒有加f就是double
    var name : String
    name = "Jack"

    val score = 60
    println(score > 80)

    var  c : Char = 'a'
    println( (c.toInt()) > 60)//可以透過轉型達到類似JAVA unicode的概念


    var s :String? ="abc"//?是可以為null
    s = null
    println(s?.length)//?修飾可以印出Null !!可以拋出exception 要自己處理
    println(s?.get(0))
    println(s?.substring(0,2))



}


class  Person(var name: String = "", var weight :Float,var height:Float){
    init {
        println("test $weight $height")
    }
//    constructor(name: String,weight: Float,height: Float) : this(weight,height)


    fun bmi() : Float{
        val bmi= weight/(height*height)
        return bmi

    }

    fun hello(){
        println("Hello Kotlin")
    }
}