package org.example.public_test

// A, B, c, d 모두 다른 패키지에 있으므로 import로 등록을 해줘야 한다.
import org.example.A
import org.example.B
import org.example.c
import org.example.d

fun main() {
    println(A().a)      // 10
    println(A().b())    // 10
                        // kotlin.Unit
    println(c)          // 20
    println(d())        // kotlin.Unit
    println(B().e())    // 10
                        // 10
                        // kotlin.Unit
                        // kotlin.Unit
}