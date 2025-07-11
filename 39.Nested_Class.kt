package org.example

class A (var name: String){

    fun show() {
        println("A : $name")
    }

    class B {               // 중첩 클래스
        fun show() {        // A 클래스 안에, 독립된 B 클래스를 정의한 것
            println("B")    // 때문에 A 클래스의 name 프로퍼티에 접근할 수 없다.
        }
    }
}

fun main() {
    var a = A("댕댕이")
    a.show()        // A : 댕댕이

    var b = A.B()   // 중첩 클래스는 정적인 클래스이므로, 인스턴스로 접근하지 않는다.
    b.show()        // B
}