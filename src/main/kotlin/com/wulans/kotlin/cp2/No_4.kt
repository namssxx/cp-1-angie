package com.wulans.kotlin.cp2

fun main() {
    val scanner = java.util.Scanner(System.`in`)
    while (scanner.hasNext()) {
        val n = scanner.nextInt()
        val m = scanner.nextInt()
        val sequence = mutableListOf<Int>()
        var num = n
        while (num > 1 && num % m == 0) {
            sequence.add(num)
            num /= m
        }
        if (num == 1) {
            sequence.add(1)
            println(sequence.joinToString(" "))
        } else {
            println("Boring!")
        }
    }
}
