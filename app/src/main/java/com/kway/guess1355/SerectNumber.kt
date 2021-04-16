package com.kway.guess1355

import java.util.*

class SerectNumber {
    val sercret : Int = Random().nextInt(10)+1
    var count = 0

    fun validate(number: Int) : Int {
        count++
        return number - sercret
    }
}

fun main(){
    val serectNumber = SerectNumber()
    println(serectNumber.sercret)
    println("$serectNumber.validate(2),count:$serectNumber.count")
}