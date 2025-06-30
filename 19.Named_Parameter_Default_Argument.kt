package org.example

fun main() {
    println(sum1(1, 2)) // 일반적으로 함수를 호출하는 방식
    println(sum1(a = 3, b = 4)) // 어떤 매개변수에 값을 전달할지 직접 지정할 수 있다.
    println(sum2(5))        // 인수는 왼쪽 매개변수부터 차례로 전달되므로, 5는 a에 값이 전달된다.
    println(sum2(6, 7)) // 매개변수 b는 기본값이 정의되어 있더라도, 호출할 때 다른 값을 전달하여 실행할 수 있다.
    println(sum3(8))        // 인수는 왼쪽 매개변수부터 차례로 전달되므로, b에 값이 결정되지 못해서 오류
    println(sum3(b = 9))        // 매개변수 a는 기본값이 정의되어 있으므로, b에만 값을 전달해도 된다.
    println(sum4())             // 매개변수 a, b에 모두 기본값이 정의되어 있으므로, 실행가능
}

fun sum1(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int = 1): Int { // 매개변수에 기본값을 지정할 수 있다.
    return a + b
}

fun sum3(a: Int = 2, b: Int): Int {
    return a + b
}

fun sum4(a: Int = 3, b: Int = 4): Int {
    return a + b
}