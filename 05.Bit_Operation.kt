package org.example

fun main() {

    // 같은 자리에 있는 비트끼리 연산한다.
    println(0b0101 and 0b0001)  // 1, C언어의 & 연산과 같다.
    println(0b0101 or 0b0001)   // 5, C언어의 | 연산과 같다.
    println(0b0101 xor 0b0001)  // 4, C언어의 ^ 연산과 같다.

    // 비트 시프트 연산
    println(0b0101 shl 1)   // 10, C언어의 << 연산과 같다.
    println(2 shr 1)        // 1,  자바의 >>> 연산과 같다.
    println(-2 shr 1)       // -1, >>> 연산은 비트를 오른쪽으로 옮길 때 부호를 유지해준다.
    println(2 ushr 1)       // 1,  C언어의 >> 연산과 같다.
    println(-2 ushr 1)      // 2147483647,  >> 연산은 비트를 오른쪽으로 옮길 때 부호를 삭제한다.
}