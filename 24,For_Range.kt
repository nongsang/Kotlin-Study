package org.example

fun main() {
    // 1..5는 1부터 5까지 원소를 가진 배열인 IntRange 타입이다.
    // 1부터 5까지 범위를 나타내기 위한 타입이다.
    for (value in 1..5) {
        print(value)            // 12345
    }

    println()

    // 마지막 값 전까지 순회하려면 마지막 숫자 앞에 '<'를 붙이면 된다.
    for (value in 1..<5) {
        print(value)            // 1234
    }

    println()

    // 역으로 순회하려면 downTo 함수를 사용한다.
    for (value in 5 downTo 1) {
        print(value)            // 54321
    }

    println()

    // 지금까지는 원소 하나씩 순회했다면, step 함수는 변화량을 수정할 수 있다.
    for (value in 1..10 step 3) {
        print(value)                    // 1 4 7 10
    }
}