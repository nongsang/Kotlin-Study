package org.example

fun main() {
    var num1 = 123              // Int 타입
    var num2 = 123L             // Long 타입, 리터럴에 접미사 L을 붙이면 자동으로 Long 타입으로 추론한다.
    var num3 = 1233214534646    // Int 타입이 저장할 수 있는 값의 범위를 넘어서 Long 타입으로 추론
    var num4 = 3.52             // Double 타입
    var num5 = 3.52F            // Float 타입, 리터럴에 접미사 F를 붙이면 자동으로 Float 타입으로 추론한다.

    var num6 : Byte = 24        // Byte 타입
    var num7 : Short = 6432     // Short 타입
    var num8 : Int = 2335612    // Int 타입
    var num9 : Long = 678982934 // Long 타입

    var num10 : Float = 3.62F   // Float 타입 리터럴은 F를 뒤에 붙여줘야 한다.
    var num11 : Double = 6.2    // Double 타입

    var num12 : Long = 1234
    //var num13 : Int = num12     // 암묵적 타입 변환은 지원하지 않으므로 에러
    var num14 : Int = num12.toInt() // toInt(), toFloat() 등의 함수를 사용해서 변환해야 한다.

    var num15 = 1_000_000       // 1000000, 밑줄을 사용해서 가독성을 높일 수 있다.

    var hexNum = 0xABCD1234     // 접두사 0x를 사용해서 16진수 숫자를 표현할 수 있다.
    var byteNum = 0b10101010    // 접두사 0b를 사용해서 2진수 숫자를 표현할 수 있다.

    var num16 : Int = 123
    var num17 : Double = 123.0
    var num18 : Long = 123

    // Number 클래스는 모든 타입의 최상위 클래스
    // 그러므로 Number 변수는 모든 타입의 값을 저장할 수 있다.
    val num19 : Number = num16
    val num20 : Number = num17
    val num21 : Number = num18
}