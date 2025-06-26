package org.example

fun main() {
    println(test1())    // kotlin.Unit
    println(test2())    // kotlin.Unit
    println(test3())    // kotlin.Unit
    println(test4())    // kotlin.Unit
    println(test1(1, 2))    // 에러
    println(addTest2(3, 4))    // 3, kotlin.Unit
}

// 기본적으로 반환형을 선언하지 않으면 Unit 반환형이 Unit 타입이다.
// Unit은 다른 언어의 void와 같은 의미
fun test1() {}

// 반환형이 Unit임을 명식적으로 선언
// return을 사용하지 않아도 자동으로 함수의 끝에 다으면 함수를 종료한다.
fun test2(): Unit {}

// return을 사용하여 명확하게 함수가 끝나는 위치를 지정할 수 있다.
// 반환형을 지정하지 않았으므로 반환형이 Unit 
fun test3() {
    return
}

// 반환형이 Unit임을 명시적으로 선언
// return을 사용하여 명확하게 함수가 끝나는 위치를 지정했다.
fun test4(): Unit {
    return
}

// 반환형을 지정하지 않은 함수는 Unit 타입이다.
// 다른 언어의 경우로 예시를 들면, void 함수의 반환값을 넣어서 return을 호출하려는 시도와 비슷한 상황이다.
// 이 부분에서는 void에서 Int 타입 등으로 형변환이 불가능하므로 에러가 발생한다.
fun addTest1 (a: Int, b: Int) {
    return a + b
}

// 반환값이 없다는 의미로 생각하여, 내부에서 특정한 기능을 실행하게 하는 기능으로 사용할 수 있다.
// 로그 출력, 에러 체크 등
fun addTest2 (a: Int, b: Int) {
    print("${a + b}, ")
}