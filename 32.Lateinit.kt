package org.example

class User {
    lateinit var name: String   // 프로퍼티는 값이 반드시 초기화 되어야 하지만
    // 초기화 시점에 값을 특정할 수 없는 경우, 나중에 값을 할당한다는 의미로
    // lateinit 키워드를 지원한다.

    fun showName() {
        if (::name.isInitialized) { // '::'으로 시작하는 프로퍼티 참조기능에서 프로퍼티가 초기화되었는지 검사가 가능하다.
            println(name)
        } else {
            println("초기화 안됨")
        }
    }
}

fun main() {
    var user = User()

    user.showName()     // 초기화 안됨

    user.name = "야호"    // 초기화 완료
    user.showName()     // 야호
}