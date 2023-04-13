package com.wulans.kotlin.cp4

fun main() {
    val n = readLine()!!.toInt()

    repeat(n) {
        val m = readLine()!!.toInt()

        val x1 = m.toString()

        val binaryX1 = Integer.toBinaryString(x1.toInt())

        val b1 = binaryX1.count { it == '1' }

        val x2 = m.toString(16)

        val binaryX2 = Integer.toBinaryString(x2.toInt(16))

        val b2 = binaryX2.count { it == '1' }

        val result = m xor (b1 * b2)

        println("$b1 $b2")
    }
}



