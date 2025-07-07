package org.example

class User {
    lateinit var name: String   // 프로퍼티는 값이 반드시 초기화 되어야 하지만
                                // 초기화 시점에 값을 특정할 수 없는 경우, 나중에 값을 할당한다는 의미로
                                // lateinit 키워드를 지원한다.

    fun showName() {
        println(name)
    }
}

fun main() {
    var user = User()

    user.name = "야호"
    user.showName()
}