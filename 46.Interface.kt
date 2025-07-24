package org.example

abstract class Bird (val name: String) {    // 새지만 일반 동물처럼 자고, 먹는 기능밖에 없다.
    abstract var age: Int
    open var species: String = "조류"

    fun sleep() {               // 오버라이딩 없이 사용할 함수
        println("$name, ${age}살, $species: 쿨쿨~")
    }

    open fun eatFood() {        // 오버라이딩 가능한 함수
        println("$name, ${age}살, $species: 냠냠~")
    }
}

abstract class Fish (val name: String) {    // 물고기지만 일반 동물처럼 자고, 먹는 기능밖에 없다.
    open var species: String = "어류"

    fun sleep() {               // 오버라이딩 없이 사용할 함수
        println("$name, $species: 쿨쿨~")
    }

    open fun eatFood() {        // 오버라이딩 가능한 함수
        println("$name, $species: 냠냠~")
    }
}

class Sparrow (name: String): Bird(name), Flyable { // 참새는 조류이면서 날 수 있는 기능이 있다.
    override var age: Int = 4
    override var species: String = "참새"
    override var isFlying: Boolean = false
        get() = field
        set(value) {field = value}

    override fun fly() {
        isFlying = true
        println("$name, ${age}살, $species: 난다~")
    }

    override fun landing() {
        isFlying = false
        println("$name, ${age}살, $species: 착륙~")
    }
}

class Penguin (name: String): Bird(name), Swimmable {   // 펭귄은 조류임에도 날지 못하고, 대신 수영을 할 수 있다.
    override var age: Int = 2
    override var species: String = "펭귄"
    override var isSwimming: Boolean = false
        get() = field
        set(value) {field = value}

    override fun swim() {
        isSwimming = true
        println("$name, ${age}살, $species: 헤엄친다~")
    }
}

class Mackerel (name: String): Fish(name), Swimmable {
    override var species: String = "고등어"
    override var isSwimming: Boolean = false
        get() = field
        set(value) {field = value}

    override fun swim() {
        isSwimming = true
        println("$name, $species: 헤엄친다~")
    }

}

interface Flyable {         // 하늘을 나는 기능을 모아놓은 인터페이스
    var isFlying: Boolean   // 하늘을 날고 있는지 상태를 나타낸다.

    fun fly()               // 하늘을 나는 기능을 선언
    fun landing()           // 착륙하는 기능을 선언
}

interface Swimmable {       // 헤엄치는 기능을 모아놓은 인터페이스
    var isSwimming: Boolean // 헤엄치고 있는지 상태를 나타낸다.

    fun swim()              // 헤엄치는 기능을 선언
}

fun main() {
    var sparrow: Sparrow = Sparrow("짹짹이")   // 참새 생성
    sparrow.eatFood()
    sparrow.sleep()
    sparrow.fly()
    sparrow.landing()

    var penguin: Penguin = Penguin("검은머리")  // 펭귄 생성
    penguin.sleep()
    penguin.eatFood()
    penguin.swim()

    var mackerel: Mackerel = Mackerel("등푸른")    // 고등어 생성
    mackerel.sleep()
    mackerel.eatFood()
    mackerel.swim()

    var list = listOf<Swimmable>(penguin, mackerel) // 헤엄칠 수 있는 기능이 있는 대상들을 모두 모아서
    list.forEach { elem->elem.swim() }  // 헤엄치는 기능 호출
}