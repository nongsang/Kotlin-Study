package org.example

fun main() {
    var num1 = 10

    // 기본 if-else 표현식
    if (num1 > 5) {
        println("${num1}는 5보다 크다.")
    } else {
        println("${num1}는 5보다 작거나 같다.")
    }

    // else-if로 조건 중첩을 구현할 수 있다.
    if (num1 < 3) {
        println("${num1}는 3보다 크다.")
    } else if (num1 < 6) {
        println("${num1}는 6보다 크다.")
    } else {
        println("${num1}는 6이상이다.")
    }

    var num2 = if (num1 > 5) 1 else 2   // 코틀린은 삼항 연산자를 if-else로 구현한다.
                                        // (num1 > 5) ? 1 : 2와 같은 의미다.

    println(num2)

    var num3 = if (num2 < 3) {  // 코틀린은 if-else 조건식의 결과로 값을 반환하는 방식으로 삼항 연산자를 구현하므로, 2개 이상의 조건 검사가 가능하다.
        1
    } else if (num2 < 6) {
        2
    } else {
        3
    }
    println(num3)
}