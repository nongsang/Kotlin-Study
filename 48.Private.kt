package org.example

open class A {
    private val a: Int = 10  // private이므로 현재 클래스에서만 접근 가능
    private fun b() {        // private이므로 현재 클래스에서만 접근 가능
        println(a)           // a가 private이므로 접근 가능
    }
}

private val c = 20   // private이므로 현재 파일에서는 접근 가능
private fun d() {}   // private이므로 현재 파일에서는 접근 가능

class B: A() {
    fun e() {       // public이므로 어떤 곳에서든 접근 가능
        println(a)  // a가 private이므로 접근 불가능
        println(b())// b가 private이므로 접근 불가능
    }
}

fun main() {
    println(A().a)      // a가 private이므로 실행 불가능
    println(A().b())    // b가 private이므로 실행 불가능
    println(c)          // 20
    println(d())        // kotlin.Unit
    println(B().e())    // a와 b가 private이므로 실행 불가능
}