package org.example

fun square(x: Int) = x * x  // 함수를 실행할 때 전달받는 x를 매개변수라 한다.

fun test1(i: Int) {
    i = i + 10      // 매개변수 i는 읽기 전용이므로 에러
}

fun test2(i: Int) {
    var i = i + 10  // 지역변수 i에 매개변수 i와 10을 더한 값을 저장하므로 사용 가능
                    // 지역변수 i와 매개변수 i는 식별자가 같아서 혼동이 발생하므로 지역변수와 매개변수는 식별자를 다르게 정의한다.
}

fun main() {
    var num : Int = square(4)   // 여기서 함수로 전달하는 값인 4가 인수다.

    println(num)
}