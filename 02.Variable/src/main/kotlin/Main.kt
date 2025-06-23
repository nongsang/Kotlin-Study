package org.example

fun main() {
    val a = 10          // 읽기 전용 변수 생성
    var b = "ABC"       // 수정 가능한 변수
    var c : Int = 20    // 변수의 자료형을 명시할 수 있다.
    var d : Int         // 자료형을 명시하면 값을 할당하지 않아도 선언할 수 있다.

    println(a)
    println(b)
    println(c)
    // println(d)   // 변수는 값이 할당되지 않으면 사용할 수 없다.

    // a = 20   // a는 읽기 전용이므로 수정 불가능
    b = "CBD"   // 재할당 가능
    c = 30
    d = 40

    println(b)
    println(c)
    println(d)  // 변수에 값을 할당한 이후이므로 출력 가능
}