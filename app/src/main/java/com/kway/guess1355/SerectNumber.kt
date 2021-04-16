package com.kway.guess1355

import java.util.*

class SerectNumber {
    var sercret : Int = Random().nextInt(10)+1
    var count = 0

    fun validate(number: Int) : Int {
        count++
        return number - sercret
    }

    fun reset(){
        sercret = Random().nextInt(10)+1
        count = 0
    }
}

fun main(){
    val serectNumber = SerectNumber()
    println(serectNumber.sercret)
    println("$serectNumber.validate(2),count:$serectNumber.count")
}