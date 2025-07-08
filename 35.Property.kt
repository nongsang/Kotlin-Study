package org.example

class A {
    var name: String = "점박이"    // var로 선언하면 게터와 세터 모두 자동으로 구현된다.
    val age: Int = 10             // val로 선언하면 게터만 자동으로 구현된다.

    fun show() {
        println("$name : ${age}살")
    }
}

fun main() {
    var a = A()

    a.show()

    a.name = "삽살이"  // name의 세터 호출
    // a.age = 5    // age는 val로 선언했으므로 외부에서 값을 바꿀 수 없다.

    a.show()
}