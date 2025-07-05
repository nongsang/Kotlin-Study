package org.example

class User(val name: String?) {
    fun showName() {
        println(name ?: "default")  // name의 값이 있으면 name의 값을, 값이 없으면 "default"를 반환한다.
    }
}

fun main() {
    var user: User? = User(null)
    user?.showName()            // 전달한 값이 null이므로 showName() 내부에서 null임을 판단하여 default를 반환

    user = User("야호")   // "야호"를 전달하여 할당
    user?.showName()            // 야호
    user.showName()             // user의 인스턴스가 존재하고, showName() 내부에도 유효한 값들만 존재함을 판단했을때,
                                // 스마트 캐스팅으로 User? 타입에서 User 타입으로 형변환되므로, '.'로 접근할 수 있다.
}