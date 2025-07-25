package org.example

data class A(       // data 클래스는 data로 사용하기 위한 클래스이므로 주 생성자가 반드시 필요하다.
    val a: Int,
    val b: String
)

fun main() {
    var a: A = A(10, "짝짝이")
    var b: A = A(20, "노랭이")

    // data 클래스는 모든 프로퍼티의 값이 같은지를 검사한다.
    println(a == A(10, "짝짝이"))  // true
    println(b == A(10, "노랭이"))  // false
}