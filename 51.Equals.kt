package org.example

class A

class B {
    override fun equals(other: Any?): Boolean { // equals는 Any에서 제공하는 함수이므로 재정의하여 사용할 수 있다.
        if (other is A)
            return true
        return false
    }
}

fun main() {
    var a: A = A()
    var b: A = A()

    println(a.equals(a))    // a.equals(a)는 a == a와 같다.
    println(a.equals(b))    // a.equals(b)는 a == b와 같다.

    var c: B = B()

    println(c == c) // 재정의된 equals를 호출하므로 false
    println(c == a) // true
}