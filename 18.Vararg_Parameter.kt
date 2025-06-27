package org.example

fun main() {
    println(test(1))
    println(test(1, 2))
    println(test(1, 2, 3, 4, 5, 6))
}

fun test(vararg params: Int): Int { // 매개변수를 vararg로 선언하면 여러 값을 받을 수 있다.
                                    // 이때 params의 타입은 Array<Int>다.
                                    // 배열은 여러 값이 연속적으로 나열된 묶음이다.

    var sum = 0

    for (elem in params) {  // params의 원소들을 하나씩 순회하여
        sum += elem         // 각 원소들을 더한다.
    }                       // 결과적으로 params에 있는 모든 원소의 값을 더한 결과가 나온다.

    return sum
}
