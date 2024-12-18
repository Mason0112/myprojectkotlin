package org.example.Student

import java.util.*

fun main() {


//    scnner()

    Student.pass = 50
    val stu = Student("Mason1", 60, 97)
    val stu2 = Student("Mason2", 60, 55)
    val stu3 = Student("Mason3", 60, 30)
    val gstu = GraduateStudent("Mason4", 60, 60, 60)
    val gstu2 = GraduateStudent("Mason5", 90, 70, 80)
    stu.printScore()
    stu2.printScore()
    stu3.printScore()
    gstu.printScore()
    gstu2.printScore()
    println("最高成績是 ${stu.highest()}")

}

private fun scnner() {
    val scanner = Scanner(System.`in`)//避開關鍵字
//    print("please enter student name:")
//    var name = scanner.next()
    var name = null

    print("please enter student english score:")
    var englishScore = scanner.nextInt()

    print("please enter student math score:")
    var mathScore = scanner.nextInt()


    val stu = Student(name, englishScore, mathScore)
    stu.printScore()
    stu.namechexk()
}


class GraduateStudent ( name: String?,
                        english: Int,
                        math: Int,
                        var thesis: Int) : Student(name, english, math) {

    companion object {
        @JvmStatic
        var pass = 70
    }

    override fun printScore() {
        print("$name\t$english\t$math\t$thesis\taverage is${getAverage()}\t ${passOrFailed()}\t")
        println(grading())
    }

    override fun passOrFailed(): String {
        return if (getAverage() >= pass) "pass" else "failed"
    }
}


open class Student( var name: String?, var english: Int, var math: Int) {

    companion object {
        @JvmStatic
        var pass = 60

    }





    open fun printScore() {
        print("$name\t$english\t$math\taverage is${getAverage()}\t ${passOrFailed()}\t")
        println(grading())
    }

    open fun passOrFailed() = if (getAverage() >= pass) "pass" else "failed"

    //function的定義
    internal  fun grading() = when (getAverage()) {

        in 90F..100F -> 'A'
        in 80F..89F -> 'B'
        in 70F..79F -> 'C'
        in 60F..69F -> 'D'
        else -> 'F'

    }

    fun getAverage() = (english + math) / 2F


    fun namechexk() {
        println(name?.length)//遇到null不去計算長度
    }

    fun highest() = if (english > math) {
        //區塊的最後一行的值 會是max附值的對象
        print("Highest is English  ")
        english
    } else {
        print("Highest is Math  ")
        math
    }

}