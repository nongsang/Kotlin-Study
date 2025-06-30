package org.example

fun main() {
    var list = listOf("A", "B", "C")

    // for는 기본 동작이 나열된 원소를 순회하여 실행한다.
    for (value in list) {
        print(value)
    }
}