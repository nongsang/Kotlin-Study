package org.example

class A

fun main() {
    var a: A = A()
    var b: A = A()

    // {클래스 이름}@{해시코드} 형태로 반환한다.
    println(a.toString())   // println(a)를 호출해도 같다.
    println(b.toString())   // println(b)를 호출해도 같다.
}