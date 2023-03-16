package com.wulans.kotlin.cp2

fun main() {
    while (true) {
        val line = readLine() ?: break
        var inQuotes = false
        val sb = StringBuilder()
        for (c in line) {
            when (c) {
                '"' -> {
                    if (inQuotes) {
                        sb.append("''")
                    } else {
                        sb.append("``")
                    }
                    inQuotes = !inQuotes
                }
                else -> sb.append(c)
            }
        }
        println(sb.toString())
    }
}
