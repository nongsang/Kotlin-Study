package org.example

class User(val name: String?) {
    fun showName() {
        if (name != null)   // name이 String? 타입이지만 null이 아님이 확실할 때 String 타입으로 자동 형변환된다.
            println(name)
    }
}

fun main() {
    var user: User? = User(null)
    user?.showName()                    // 전달한 값이 null이므로 showName() 내부에서 null임을 판단하여 아무 출력도 안됨

    user = User("야호")   // "야호"를 전달하여 할당
    user?.showName()            // 야호
    user.showName()             // user의 인스턴스가 존재하고, showName() 내부에도 유효한 값들만 존재함을 판단했을때,
                                // 스마트 캐스팅으로 User? 타입에서 User 타입으로 형변환되므로, '.'로 접근할 수 있다.
}