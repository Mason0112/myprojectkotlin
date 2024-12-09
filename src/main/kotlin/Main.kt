package org.example

fun main() {
//    println("Hello World!")
//    Person().Hello();
    val p =Person();
    p.Hello();
    var age = 19;
    age = 20;
    var weight = 66.5;//沒有加f就是double
    var name : String;
    name = "Jack";
    
}


class  Person{
    fun Hello(){
        println("Hello Kotlin");
    }
}