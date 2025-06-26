package org.example

fun main() {
    println(addTest1(1,2))      // 3
    println(addTest2(3,4))      // kotlin.Unit
    println(addTest3(5,6))      // 11, kotlin.Unit
    println(addTest4(7,8))      // 15, kotlin.Unit
    println(addTest5(9,10))     // 19
    println(addTest6(11,12))    // 23
}

// 기본 함수 형태
// 매개변수 자료형은 반드시 명시해야 한다.
fun addTest1 (a: Int, b: Int): Int {
    return a + b
}

// 생략 형태
// 반환형과 return 키워드를 동시에 생략할 수 있다.
// 이 때는 반환형이 다른 언어의 void에 해당하는 Unit이다.
// a + b라는 작업만을 하고 함수가 종료되기 때문에 계산값을 반환하지 않는다.
fun addTest2 (a: Int, b: Int) {
    a + b
}

// 반환형이 Unit이라면 반환값이 없고, 자체만으로 어떤 작업을 하는 함수라는 의미로 사용한다.
fun addTest3 (a: Int, b: Int): Unit {
    print("${a + b}, ")
}

fun addTest4 (a: Int, b: Int) {
    print("${a + b}, ")
}

// 단일 표현식
// 함수의 모든 기능을 한 줄로 표현할 수 있다면, 가장 간략한 함수 표현식
fun addTest5 (a: Int, b: Int) = a + b

// 반환형 명시화 단일 표현식
// 반환형을 명시하여 변환할 자료형을 명시할 수 있다.
fun addTest6 (a: Int, b: Int): Int = a + b