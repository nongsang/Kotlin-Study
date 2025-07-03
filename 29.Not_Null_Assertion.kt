package org.example

class User(val str: String) {
    var name: String? = null
    fun showName() {
        println(name)
    }
}

fun main() {
    var user1: User? = User("야호")

    println(user1!!.name)    // '!!.'를 붙여서 user가 nullable 이면서 인스턴스가 존재한다는 힌트를 준다.

    //user1 = null     // null 할당

    //println(user1!!.name)    // NullPointerException 예외
                            // '!!.'는 인스턴스가 존재한다는 힌트를 주는 것일 뿐이기 때문에 컴파일타임이 아니라 런타임에 user의 인스턴스를 검사한다.

    // '!!.'은 객체가 NullPointerException 예외밖에 발생하지 않으므로 정확하게 어떤 예외인지 알기 힘들다.
    // 더 의미있는 예외를 발생하기 위한 함수를 제공한다.

    var user2: User? = null

    var userName1 = requireNotNull(user2?.name)  // user2의 name의 값이 null이라면 IllegalArgumentException을 던진다.
    println(userName1)

    var userName2 = checkNotNull(user2?.name)    // user2의 name의 값이 null이라면 IllegalStateException을 던진다.
    println(userName2)
}