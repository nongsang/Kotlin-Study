package org.example

fun main() {
    println(addTest1(1,2))      // 3
    println(addTest2(3,4))      // 7
    println(addTest3(5,6))      // 11
}

// 기본 함수 형태
// 매개변수 자료형은 반드시 명시해야 한다.
fun addTest1 (a: Int, b: Int): Int {
    return a + b
}

// 단일 표현식
// 함수의 모든 기능을 한 줄로 표현할 수 있다면, 가장 간략한 함수 표현식
fun addTest2 (a: Int, b: Int) = a + b

// 반환형 명시화 단일 표현식
// 반환형을 명시하여 변환할 자료형을 명시할 수 있다.
// 가능하면 반환형을 명시하는 것이 가독성에 좋다.
fun addTest3 (a: Int, b: Int): Int = a + b