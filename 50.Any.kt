package org.example

fun test1(arg: Any?) {       // null을 포함한 모든 타입의 대상을 받을 수 있다.
    println("test1: arg is $arg")
}

fun test2(arg: Any) {
    println("test2: arg is $arg")
}

fun main() {
    test1(null)
    test2(123)
    test2("asd")
}