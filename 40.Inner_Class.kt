package org.example

class A (var name: String){

    fun show() {
        println("A : $name")
    }

    inner class B {                 // 내부 클래스
        fun show() {                // A 클래스 안에, A과 관련된 B 클래스를 정의한 것
            println("B : $name")    // 때문에 A 클래스의 name 프로퍼티에 접근할 수 있다.
        }
    }
}

fun main() {
    var a = A("댕댕이")
    a.show()        // A : 댕댕이

    var b = a.B()   // 내부 클래스는 정적이지 않으므로, A의 인스턴스를 통해 생성해야 한다.
    b.show()        // B : 댕댕이
}