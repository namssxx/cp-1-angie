package com.wulans.kotlin.cp4

fun main() {
    val primes = BooleanArray(1000001) { true }
    primes[0] = false
    primes[1] = false
    for (i in 2..1000) {
        if (primes[i]) {
            for (j in i * i..1000000 step i) {
                primes[j] = false
            }
        }
    }
    while (true) {
        val input = readLine()?.toIntOrNull() ?: break
        if (primes[input]) {
            val reversed = input.toString().reversed().toIntOrNull()
            if (reversed != null && primes[reversed] && reversed != input) {
                println("$input is emirp.")
            } else {
                println("$input is prime.")
            }
        } else {
            println("$input is not prime.")
        }
    }
}
