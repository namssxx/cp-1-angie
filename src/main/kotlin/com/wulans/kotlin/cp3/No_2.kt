package com.wulans.kotlin.cp3

fun main() {
    val t = readLine()!!.toInt()
    for (test in 1..t) {
        val n = readLine()!!.substringAfter(" = ").toInt()
        val matrix = Array(n) { IntArray(n) }
        for (i in 0 until n) {
            val row = readLine()!!.split(" ").map { it.toInt() }
            for (j in 0 until n) {
                matrix[i][j] = row[j]
            }
        }
        var isSymmetric = true
        for (i in 0 until n) {
            for (j in 0 until n) {
                if (matrix[i][j] < 0 || matrix[i][j] != matrix[n - 1 - i][n - 1 - j]) {
                    isSymmetric = false
                    break
                }
            }
            if (!isSymmetric) {
                break
            }
        }
        println("Test #$test: ${if (isSymmetric) "Symmetric." else "Non-symmetric."}")
    }
}
