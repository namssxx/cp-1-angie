package com.wulans.kotlin.cp2

fun main() {
    while (true) {
        val line = readLine()?.trim() ?: break
        if (line == "0") {
            break
        }
        val sum = line.foldIndexed(0) { index, acc, c ->
            val sign = if ((line.length - index) % 2 == 0) 1 else -1
            acc + sign * (c - '0')
        }
        if (sum % 11 == 0) {
            println("$line is a multiple of 11.")
        } else {
            println("$line is not a multiple of 11.")
        }
    }
}