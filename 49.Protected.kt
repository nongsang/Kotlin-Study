package org.example

open class A {
    protected val a: Int = 10  // protected이므로 현재 클래스, 하위 클래스에서 접근 가능
    protected fun b() {        // protected이므로 현재 클래스, 하위 클래스에서 접근 가능
        println(a)             // a가 protected이므로 접근 가능
    }
}

class B: A() {
    fun e() {       // public이므로 어떤 곳에서든 접근 가능
        println(a)  // a가 protected이므로 접근 가능
        println(b())// b가 protected이므로 접근 가능
    }
}

class C: A() {
    fun f() {       // public이므로 어떤 곳에서든 접근 가능
        println(a)  // a가 protected이므로 접근 가능
        println(b())// b가 protected이므로 접근 가능
    }
}

fun main() {
    println(A().a)      // a가 protected이므로 실행 불가능
    println(A().b())    // b가 protected이므로 실행 불가능
    println(B().e())    // e는 public이므로 실행 가능
    println(C().f())    // f는 public이므로 실행 가능
}