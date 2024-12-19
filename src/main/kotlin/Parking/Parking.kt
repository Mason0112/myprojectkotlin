package org.example.Parking

import java.time.Duration
import java.time.LocalDateTime

fun main() {
    var enterTime = LocalDateTime.of(2024, 1, 1, 8, 0)
    var leaveTime = LocalDateTime.of(2024, 1, 1, 10, 50)

    var car = Car("AA-7777",enterTime)
    car.leaveTime = leaveTime
    car.duration()
    println(car.duration())
    val hours = Math.ceil(car.duration() / 60.0).toLong()

    println(hours)


}

class Car(val id : String,val enterTime : LocalDateTime){
    var leaveTime : LocalDateTime? = null
        set(value) {
            if (enterTime.isBefore(value)){
                field = value
            }
        }
    fun duration() = Duration.between(enterTime,leaveTime).toMinutes()




}