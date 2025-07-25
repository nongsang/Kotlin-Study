package org.example

open class A {
    public val a: Int = 10  // public이므로 어떤 곳에서든 접근 가능
    public fun b() {        // public이므로 어떤 곳에서든 접근 가능
        println(a)
    }
}

public val c = 20   // public이므로 어떤 곳에서든 접근 가능
public fun d() {}   // public이므로 어떤 곳에서든 접근 가능

class B: A() {
    fun e() {       // public이므로 어떤 곳에서든 접근 가능
        println(a)  // a가 public이므로 어떤 곳에서든 접근 가능
        println(b())// b가 public이므로 어떤 곳에서든 접근 가능
    }
}

fun main() {
    println(A().a)      // 10
    println(A().b())    // 10
                        // kotlin.Unit
    println(c)          // 20
    println(d())        // kotlin.Unit
    println(B().e())    // 10
                        // 10
                        // kotlin.Unit
                        // kotlin.Unit
}