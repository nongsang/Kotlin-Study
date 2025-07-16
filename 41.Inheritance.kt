package org.example

open class Dog {            // open 키워드를 클래스 앞에 사용해서 클래스 상속해서 사용할 수 있는 클래스임을 정의한다.
    fun makeSound() {
        println("소리를 낸다")
    }
}

class Chiwawa : Dog() {     // Dog를 상속받은 Chiwawa를 정의했다.

}

fun main() {
    var chiwawa1: Chiwawa = Chiwawa()   // 치와와1 생성
    chiwawa1.makeSound()                // 치와와1은 따로 정의한 기능이 없지만, 상속하는 Dog()의 기능을 사용할 수 있다.

    var chiwawa2: Dog = Chiwawa()       // 치와와2는 '치와와는 개다.'라는 논리에 의해, Dog 타입이므로 치와와의 기능을 가진 채 생성이 가능하다.
    chiwawa2.makeSound()                // 다운 캐스팅이라고 생각해도 된다.

    var chiwawa3: Dog = chiwawa1        // 치와와3이라는 독립된 개체를 생성하는 것이 아니라, 치와와3이라는 이름으로 치와와1을 가리키게 한다.
    chiwawa3.makeSound()
}