package org.example

class A {
    var name: String = "점박이"
        get() = field           // field 키워드로 name 멤버변수를 가리킬 수 있다.
        set(value) {            // value는 세터로 들어온 값을 의미한다.
            if (value.isNotBlank()) {
                // name = value     // 세터 내에서 프로퍼티를 이름을 호출하면 세터를 반복호출하므로 스택오버플로우 예외가 발생한다.
                field = value
            } else {
                println("Warning : 공백 입력")
            }
        }
    val age: Int = 10
        get() = field
    // val은 세터를 정의할 수 없다.

    fun show() {
        println("$name : ${age}살")
    }
}

fun main() {
    var a = A()

    a.show()

    a.name = "  "       // 세터에서 공백검사에 걸림

    a.name = "삽살이"
    a.show()            // 삽살이 : 10살
}