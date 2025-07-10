package org.example

class A constructor(nameParam: String, ageParam: Int) { // 주 생성자, 클래스 이름 바로 뒤에 constructor 키워드로 정의한다.
    var name: String = nameParam
    var age: Int = ageParam

    fun show() {
        println("$name : ${age}살")
    }
}

class B(nameParam: String, ageParam: Int) { // 주 생성자의 constructor 키워드는 생략이 가능하다.
    var name: String = nameParam
    var age: Int = ageParam

    fun show() {
        println("$name : ${age}살")
    }
}

class C(var name: String, var age: Int) {   // 매개변수에 var, val 키워드를 사용하면
                                            // 매개변수를 멤버변수처럼 바로 사용할 수 있다.
    fun show() {
        println("$name : ${age}살")
    }
}

fun main() {
    var a = A("삽살이", 10)    // 생성자의 매개변수가 2개이므로 2개의 값을 넣고 인스턴스화를 해야 한다.
    a.show()    // 삽살이 : 10살

    var b = B("바둑이", 5)
    b.show()

    var c = C("찹쌀이", 3)
    c.show()
}