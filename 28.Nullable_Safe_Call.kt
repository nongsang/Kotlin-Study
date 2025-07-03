package org.example

class User(val str: String) {
    var name: String? = null
    fun showName() {
        println(name)
    }
}

fun main() {
    var user: User? = null  // nullable이므로 null 초기화 가능

    // nullable 타입 객체에 접근할 때, '?.'를 사용하여 안정하게 대상을 호출할 수 있다.
    // 대상이 없으면 null을 반환, 대상이 있으면 일반 호출처럼 동작한다.
    println(user?.name)     // null

    user = User("야호")   // null로 할당된 user에 새로운 객체 할당
    user?.showName()            // user가 인스턴스화 되어있는지 모르기 때문에 '?.'를 사용하여 인스턴스화되어 있을 경우 showName()을 호출하게끔 동작한다.
    println(user?.name)         // '?.'를 사용하여 안전하게 호출한다.
}