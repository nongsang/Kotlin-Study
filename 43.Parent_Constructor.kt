package org.example

open class Dog(val name: String) {  // 이름을 할당받아 생성하는 Dog 클래스
    open fun makeSound() {          // open 키워드를 사용하여 자식 클래스에서 재정의하여 사용할 수 있는 함수임을 정의한다.
        println("$name: 소리를 낸다")
    }
}

class Chiwawa(name: String) : Dog(name) {   // 이름을 할당받아 Dog의 생성자로 전달
    override fun makeSound() {              // Dog의 기능 중, open으로 선언된 함수를 재정의 한다.
        println("$name: 알! 알!")
    }
}

class Samoyed(name: String) : Dog("Mr.$name") {    // 할당받은 이름에 추가 가공하여 Dog의 생성자로 전달할 수 있다.
    override fun makeSound() {
        println("$name: 월! 월!")
    }
}

fun main() {
    var chiwawa: Chiwawa = Chiwawa("장군이")  // 치와와 생성
    chiwawa.makeSound()                             // 장군이: 알! 알!

    var samoyed: Samoyed = Samoyed("겨울이")  // 사모예드 생성
    samoyed.makeSound()                             // Mr.겨울이: 월! 월!

    var dog: Dog = Dog("개")                 // 그냥 개를 생성
    dog.makeSound()                                 // 개: 소리를 낸다
}