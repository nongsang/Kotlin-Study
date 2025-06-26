package org.example

fun double(i: Int) = i * 2 // 최상위 함수
                            // 어떤 위치에서도 호출할 수 있는 함수
                            // 주로 유틸리티 기능처럼 어떤 곳에서도 필요한 기능을 공용으로 사용할 수 있도록 최상위 함수로 정의한다.

class A {
    private fun triple(i: Int) = i * 3  // 멤버 함수
                                        // 클래스 내부에 정의된 함수
                                        // private 같은 접근 제한자는 클래스 때 다시 설명

    fun twelveTimes(i: Int): Int {      // 멤버 함수
        fun quadraple() = double(double(i)) // 지역 함수
                                                // twelveTimes()라는 멤버 함수 내부에서만 선언하고, 호출 가능한 함수
                                                // 최상위 함수 double()을 이용하여 quadraple()라는 지역 함수를 정의
        return triple(quadraple())          // 지역 함수 quadraple()과 멤버 함수 triple()을 조함하여 결과 반환
    }
}

fun main() {
    println(double(2))  // 4

    val a : A = A()
    println(a.twelveTimes(2))   // 24
}