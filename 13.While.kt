package org.example

fun main() {
    var i = 1

    while (i < 10) {
        print(i)
        i *= 2
    }
    // 1248

    println()

    var j = 1

    do {
        print(j)
        j *= 2
    } while (j < 10)
    // 1248
}