package org.example

fun main() {
    // 타입 캐스팅

    // is 키워드를 사용하여 대상의 타입을 검사할 수 있다.
    println(123 is Int)         // true
    println("ABC" is Int)       // false
    println(123 is String)      // false
    println("ABC" is String)    // true

    // 검사할 타입과 다른지 검사하려면 !is 키워드를 사용한다.
    println(123 !is Int)         // false
    println("ABC" !is Int)       // true
    println(123 !is String)      // true
    println("ABC" !is String)    // false

    // 암묵적 타입 캐스팅
    val i : Int = 123
    val l : Long = 123L
    val d : Double = 123.0

    var number : Number = i     // Number는 숫자 타입의 상위 클래스 이므로
    number = l                  // 할당할 때 암묵적으로 타입 캐스팅이 발생한다.
    number = d                  // 상위 클래스로 타입 캐스팅이 발생할 때를 업 캐스팅이라고 한다.

    // as 타입 캐스팅

    val num1 : Number = 123

    var sum = (num1 as Int) + 10    // Int는 Number의 하위 클래스 이므로 as 키워드를 사용하여 명시적으로 타입 캐스팅을 해야 한다.
                                    // 상위 클래스에서 하위 클래스로 타입 캐스팅이 발생할 때를 다운 캐스팅이라고 한다.
    println(sum)

    val num2 : Number = 123.1

    //sum = (num2 as Int) + 10        // num2는 Int가 아니므로 타운 캐스팅이 불가능하여 에러 발생
    //println(sum)

    val num3 = num2 as? Int     // as? 키워드는 캐스팅이 불가능할 때 null을 반환한다.
    println(num3)               // null
    val num4 = num2 as? Double? // num2는 123.1이므로 Double로 캐스팅이 가능하다.
    println(num4)               // 123.1

    // 타임 캐스팅 함수

    // 함수를 이용하여 안전하게 타입 캐스팅을 할 수 있다.
    val num5 = num2.toInt() + 10    // num2는 123.1이지만 소수부는 버리고 정수부만 사용해서 123 + 10을 계산한다.
    println(num5)                   // 133

    // 스마트 캐스팅
    println(lengthIfString("바보"))
    println(lengthIfString(123))
}

fun lengthIfString(arg: Any) : Int {
    if (arg is String) {    // arg가 String 타입이 맞다면
        return arg.length   // arg를 String 타입으로 자동 변환하여 처리한다.
    }
    return 0
}