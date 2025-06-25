package org.example

fun main() {

    // if 대용으로 처리 가능하다.
    var num1 = 10

    when {
        num1 < 3 -> {
            println("${num1}은 3 미만")
        }
        num1 < 6 -> {
            println("${num1}은 6 미만")
        }
        else -> {
            println("${num1}은 6 이상")
        }
    }

    // 분기 처리로 반환값 저장하는 if-else 기능 대신 사용할 수 있다.
    var num2 = when {
        num1 < 3 -> 1
        num1 < 6 -> 2
        else -> 3
    }

    // 값을 비교하여 분기처리 할 수 있다.
    when (num2) {
        1 -> println(4)
        2 -> println(5)
        else -> println(6)
    }

    // 값 or 타입을 검사하여 처리 분기를 만드는 '패턴 매칭' 기능
    testFun(null)   // null
    testFun(3)      // 작은 수
    testFun(6)      // 큰 수
    testFun("바보")   // 입력 값 : 바보
    testFun(-1)     // 입력 값 : 숫자 -1
    testFun(1L)     // 입력 값 : 숫자 1
    testFun(1.0)    // 어떤 처리도 못함
}

fun testFun(arg : Any?) {   // 매개변수로 null을 포함한 어떤 타입의 대상이라도 받을 수 있음
    when (arg) {            // 입력 받은 매개변수의 값 or 매개변수의 타입을 검사하여 분기 처리를 한다.
        null -> println("null") // null을 입력받으면 null 출력
        1, 2, 3 -> println("작은 수")  // 1, 2, 3 중 하나라도 입력 받으면 '작은 수' 출력
        in 4..10 -> println("큰 수")  // 4에서 10 사이의 값을 입력 받으면 '큰 수' 출력
        is String -> println("입력 값 : $arg") // 입력 값이 문자열 타입이면 입력한 문자열 출력
        is Int, is Long -> println("입력 값 : 숫자 $arg")    // 입력 값이 Int, Long 타입 중 하나라면 정수 출력
        else -> println("어떤 처리도 못함")    // 어떤 값, 어떤 타입도 처리할 정의를 해주지 않으면 실행
    }
}