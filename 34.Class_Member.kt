package org.example

class A {
    var name: String = "야호" // 멤버 변수, 혹은 필드(field)

    fun showName() {         // 멤버 함수, 혹은 메서드(method)
        println(this)       // this를 이용하여 인스턴스 자기자신을 식별할 수 있다.
        println(name)
    }
}

fun main() {
    var a = A()

    println(a)      // 인스턴스를 이용해서 기능에 접근할 수 있다.
    a.showName()
}