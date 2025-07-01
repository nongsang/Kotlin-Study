package org.example

fun main() {
    // break는 이번 반복에서 for문을 탈출하는 키워드다.
    for (i in 1..5) {
        if ( i == 3 ) {
            break;
        }

        print(i)    // 12
    }

    println()

    // continue는 다음 반복으로 건너뛰기를 하는 키워드다.
    for (i in 1..5) {
        if ( i == 3 ) {
            continue
        }

        print(i)    // 1245
    }
}