package org.example

fun main() {
    var c : Char = 'A'  // 문자 저장

    println(c)

    println('A')
    println('Z')

    println('A'.code)   // 문자의 유니코드를 정수로 표시
    println('가'.code)   // 유니코드이므로 다른 언어도 코드 출력

    println('\u00A3')   // £, 유니코드를 직접 사용해서 출력 가능
}