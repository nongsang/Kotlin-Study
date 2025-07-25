package org.example

class A

fun main() {
    var a: A = A()
    var b: A = A()

    // 정수의 형태로 해시코드를 반환
    // 해시코드가 다르면 서로 다른 객체다.
    println(a.hashCode())
    println(b.hashCode())
}