package com.wulans.kotlin.cp3

fun main() {
    var (n, m) = readLine()!!.split(" ").map { it.toInt() }

    while (n != 0 || m != 0) {
        // Read in the numbers
        val numbers = mutableListOf<Int>()
        repeat(n) {
            numbers.add(readLine()!!.toInt())
        }

        // Sort the numbers using the given rules
        numbers.sortWith(compareBy({ it % m }, { if (it % 2 == 0) it else -it }, { -it }))

        // Output the sorted numbers
        println("$n $m")
        numbers.forEach { println(it) }

        // Read in the next set of inputs
        val input = readLine()!!.split(" ").map { it.toInt() }
        n = input[0]
        m = input[1]
    }
}




