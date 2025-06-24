package org.example

fun main() {
    val i1 = 12
    val i2 = 34
    println(i1 + i2)    // 46
    println(i1 - i2)    // -22
    println(i1 * i2)    // 408
    println(i1 / i2)    // 0

    val d1 = 1.4
    val d2 = 2.5
    println(d1 + d2)    // 3.9
    println(d1 - d2)    // -1.1
    println(d1 * d2)    // 3.5
    println(d1 / d2)    // 0.5599999999999999
                        // 이유는 나중에 설명

    println(5 / 2)  // Int 타입 끼리의 연산 결과는 Int 타입이므로 2.5의 몫인 2가 출력

    println(5.toDouble() / 2)   // 부동소수 타입과 정수 타입끼리의 연산은 부동소수 타입이므로 2.5 출력

    // 나머지 연산
    println(1 % 3) // 1
    println(2 % 3) // 2
    println(3 % 3) // 0
    println(-1 % 3) // -1
    println(-2 % 3) // -2
    println(-3 % 3) // 0
    println(2 % -3) // 2

    var i = 1

    println(i)  // 1

    i += 10     // 'i = i + 10'의 약자
    println(i)  // 11

    i -= 5      // 'i = i - 5'의 약자
    println(i)  // 6

    i *= 3      // 'i = i * 3'의 약자
    println(i)  // 18

    i /= 2      // 'i = i / 2'의 약자
    println(i)  // 9

    i %= 4      // 'i = i % 4'의 약자
    println(i)  // 1

    // 후위 증가 연산자
    // 출력을 먼저, 연산을 나중에 한다.
    println(i++)    // 1
    println(i)      // 2

    // 전위 증가 연산자
    // 연산을 먼저, 출력을 나중에 한다.
    println(++i)    // 3
    println(i)      // 3

    // 후위 감소 연산자
    // 출력을 먼저, 연산을 나중에 한다.
    println(i--)    // 3
    println(i)      // 2

    // 전위 감소 연산자
    // 연산을 먼저, 출력을 나중에 한다.
    println(--i)    // 1
    println(i)      // 1
}