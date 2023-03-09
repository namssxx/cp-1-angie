/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package com.wulans.kotlin

fun isPrime(x: Int, i: Int = 2): Boolean {
    if (x <= 2) {
        return x == 2
    }
    if (x % i == 0) {
        return false
    }
    if (i * i > x) {
        return true
    }
    return isPrime(x, i + 1)

}
fun main() {
    val t = readLine()!!.toInt()
    for (i in 1..t) {
        val x = readLine()!!.toInt()
        val result = if (isPrime(x)) "Prime Number" else "Not Prime Number"
        println("Case #$i: $result")
    }
}


