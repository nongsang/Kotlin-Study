package org.example

fun main() {
    val text1 = "ABC"   // 문자열 저장 방식 1
    println(text1)  // ABC

    val text2 = """DEF"""   // 문자열 저장 방식 2
    println(text2)  // DEF

    val text3 = "Let\'s say:\n\"Hello\""    // 큰 따옴표를 이용한 문자열은 이스케이프 시퀀스를 사용해야 출력 가능한 문자, 줄 바꿈 등을 사용할 수 있다.
    println(text3)

    // 삼중 따옴표를 이용한 문자열은 이스케이프 시퀀스 없이 입력한 그대로의 문자열을 출력한다.
    val text4 = """Let's say:
        "Hello""""
    println(text4)

    // 삼중 따옴표를 이용한 문자열에 trimIndent() 함수로 문자열을 더 깔끔하게 간격을 정리할 수 있다.
    val text5 = """
        Let\'s say:
        "Hello"
    """.trimIndent()
    println(text5)

    // 삼중 따옴표를 이용한 문자열에 trimMargin() 함수로 문자열을 특정 문자('|')로 다음 줄 구분을 할 수 있다.
    val text6 = """Let\'s say:
        |   "Hello"""".trimMargin()
    println(text6)

    var name : String = "Bob"
    var age : Int = 10

    var text7 = "$name : $age"  // 템플릿 표현식을 이용하여 변수의 값을 문자열로 변환하여 기존 문자열에 포함할 수 있다.
    println(text7)

    var text8 = "1 + 2 = ${1 + 2}"  // 템플릿 표현식을 사용하면 템플릿 표현식 안의 수식을 먼저 계산 후, 문자열로 변환하여 기존 문자열에 포함한다.
    println(text8)

    var text9 = "ABC" + "DEF"   // 문자열끼리 더하는 연산은 뒤에 문자열을 연결하는 기능을 한다.
    println(text9)

    // '문자열 + 다른 자료형 값'은 다른 자료형 값을 문자열로 변환하여 뒤에 붙여서 출력한다.
    var text10 = "ABC" + 10 // ABC10
    println(text10)

    var text11 = "ABC" + true   // ABCtrue
    println(text11)
}