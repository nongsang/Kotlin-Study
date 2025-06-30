package org.example

// 매개변수가 많으면 각 매개변수를 한 줄씩 표시할 수 있다.
fun test1(
    i: Int,
    s: String
): String {
    return i.toString() + s
}

fun test2(
    f: Float,
    s: String,  // 후행 쉼표, 마지막 매개변수에 쉼표를 넣는 방법
): String {
    return f.toString() + s
}

fun main() {
    println(test1(10, "ABC"))
    println(test2(1.23f, "ABC"))
}