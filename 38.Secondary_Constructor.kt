package org.example

class A (var nameParam: String) {

    var name: String = nameParam
    var age: Int = 1

    constructor(nameParam: String, ageParam: Int): this(nameParam) {    // 부 생성자
                                                                        // constructor 키워드를 반드시 사용해야 하고
                                                                        // this를 이용한 주 생성자를 반드시 호출해야 한다.
        age = ageParam
    }

    fun show() {
        println("$name : ${age}살")
    }
}

fun main() {
    var a = A("삽살이")    // 주 생성자 호출
    a.show()    // 삽살이 : 1살

    var b = A("찹쌀이", 5) // 부 생성자 호출
    b.show()
}