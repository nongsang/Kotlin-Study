package org.example

class User {
    // var name: String         // 기본적으로 프로퍼티는 초기화되어야 한다.
    // var name: String = null  // 기본적으로 프로퍼티는 null로 초기화 및 할당할 수 없다.
    var name: String? = null    // nullable 타입으로 선언하면 null로 초기화 및 할당이 가능하다.
}

fun main() {
    var user1: User     // 프로퍼티가 아니라 지역변수 이므로 선언은 가능하다.

    // user1.name       // user1은 인스턴스화가 안되어 있으므로, 컴파일에러

    var user2: User = User()    // 인스턴스화

    println(user2.name) // user2를 인스턴스화할 때 String? 타입인 name을 null로 초기화하므로 null 출력

    var user3: User? = null // user3는 nullable인 User? 타입이므로 null로 초기화 가능

    println(user3.name) // user3는 초기화 단계를 지났지만 null일 수 있으므로 name에 직접 접근이 불가능하다.
}