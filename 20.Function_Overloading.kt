package org.example

// 함수 이름이 같지만 매개변수가 달라서 다른 함수로 인식 및 처리
fun type(i: Int) = "Int"
fun type(l: Long) = "Long"
fun type(a: Any) = "Any"

fun main() {
    println(type(10))       // Int
    println(type(12L))      // Long
    println(type("ABC"))    // Any, 매개변수가 String 타입이지만, 오버로딩된 함수 중 String을 처리할 수 있는 함수인 type(Any)가 실행
}