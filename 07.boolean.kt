package org.example

fun main() {
    // 참
    val b1: Boolean = true
    println(b1) // true

    // 거짓
    val b2: Boolean = false
    println(b2) // false

    // 불 동등성 비교 연산
    println(10 == 10)   // true, 10과 10은 같은가?
    println(10 == 11)   // false, 10과 11은 같은가?
    println(10 != 10)   // false, 10과 10은 다른가?
    println(10 != 11)   // true, 10과 11은 다른가?

    println(10 > 10)    // false, 10은 10을 초과하는가?
    println(10 > 11)    // false, 10은 11을 초과하는가?
    println(11 > 10)    // true, 11은 10을 초과하는가?

    println(10 < 10)    // false, 10은 10 미만인가?
    println(10 < 11)    // true, 10은 11 미만인가?
    println(11 < 10)    // false, 11은 10 미만인가?

    println(10 >= 10)   // true, 10은 10 이상인가?
    println(10 >= 11)   // false, 10은 11 이상인가?
    println(11 >= 10)   // true, 11은 10 이상인가?

    println(10 <= 10)   // true, 10은 10 이하인가?
    println(10 <= 11)   // true, 10은 11 이하인가?
    println(11 <= 10)   // false, 11은 10 이하인가?

    // 불 논리 연산

    // and 연산, 둘 중 하나만 false여도 결과는 false
    println(true && true) // true
    println(true && false) // false
    println(false && true) // false
    println(false && false) // false

    // or 연산, 둘 중 하나만 true여도 결과는 true
    println(true || true) // true
    println(true || false) // true
    println(false || true) // true
    println(false || false) // false

    // not 연산, true면 false로, false면 true를 결과를 낸다.
    println(!true) // false
    println(!false) // true
}