package org.example

class Test {
    infix fun double(i: Int) = i * 2    // infix 키워드를 적용한 멤버함수
}

fun main() {
    var test: Test = Test()

    println(test.double(2)) // 일반적인 함수 호출 방식
    println(test double 3)      // infix 키워드를 적용한 멤버함수는 점과 소괄호를 생략할 수 있다.
    println(0b0010 and 0b0011)  // infix 키워드는 편의성을 목표로 지원하는 기능이다.
    println(0b0010.and(0b0011))
}