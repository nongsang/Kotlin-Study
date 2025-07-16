package org.example

open class Dog {
    open fun makeSound() {  // open 키워드를 사용하여 자식 클래스에서 재정의하여 사용할 수 있는 함수임을 정의한다.
        println("소리를 낸다")
    }
}

class Chiwawa : Dog() {
    override fun makeSound() {  // override 키워드를 사용하여, Dog의 기능 중 open으로 선언된 함수를 재정의 한다.
        println("알! 알!")
    }
}

fun main() {
    var chiwawa1: Chiwawa = Chiwawa()   // 치와와1 생성
    chiwawa1.makeSound()                // 알! 알!

    var chiwawa2: Dog = Chiwawa()       // 치와와2는 치와와라는 개이므로 치와와의 모든 기능을 사용할 수 있다.
    chiwawa2.makeSound()                // 알! 알!

    var chiwawa3: Dog = chiwawa1        // 치와와3이라는 독립된 개체를 생성하는 것이 아니라, 치와와3이라는 이름으로 치와와1을 가리키게 한다.
    chiwawa3.makeSound()                // 알! 알!

    var chiwawa4: Dog = Dog()           // 개라는 대상을 생성. 상속한 대상을 생성한게 아니기 때문에 Dog의 기능만 사용 가능
    chiwawa4.makeSound()                // 소리를 낸다
}