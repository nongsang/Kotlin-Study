package org.example

abstract class Animal(val name: String) {   // abstract 키워드를 사용하면, 이 클래스 독립적으로 생성이 불가능하고 자식 클래스를 통해야만 기능을 사용할 수 있다.
    abstract var age: Int               // abstract 키워드로 프로퍼티를 선언했으므로, 자식 클래스에서 반드시 재정의 해야한다.
    open var species: String = "동물"    // 오버라이딩 가능한 프로퍼티이므로, 그대로 사용할 수도, 재정의할 수도 있다.

    fun sleep() {               // 오버라이딩 없이 사용할 함수
        println("$name, ${age}살, $species: 쿨쿨~")
    }

    open fun eatFood() {        // 오버라이딩 가능한 함수
        println("$name, ${age}살, $species: 냠냠~")
    }

    abstract fun seeFriend()    // abstract 키워드를 적용하여, 자식 클래스에서 정의해야만 하는 함수
}

class KoreanShortHair(name: String): Animal(name) {
    override var age: Int = 0   // age는 abstract 프로퍼티이므로 재정의
        get() = field
        set(value) {
            if (value >= 0) {
                field = value
            }
        }

    override var species: String = "고양이" // species 재정의

    override fun seeFriend() {  // 추상 함수 재정의
        println("$name, ${age}살, $species: 야옹~")
    }
}

class Retriever(name: String): Animal(name) {
    override var age: Int = 3   // age는 abstract 프로퍼티이므로 재정의

    override fun eatFood() {    // 함수 재정의
        super.eatFood()
        println("$name, ${age}살, $species: 와그작 와그작!")
    }

    override fun seeFriend() {  // 추상 함수 재정의
        println("$name, ${age}살, $species: 자리에 앉기")
        println("$name, ${age}살, $species: 월! 월!")
    }
}

fun main() {
    var koreanShortHair: KoreanShortHair = KoreanShortHair("치즈")    // 코리안 숏 헤어 생성
    koreanShortHair.seeFriend()     // 치즈, 0살, 고양이: 야옹~
    koreanShortHair.eatFood()       // 치즈, 0살, 고양이: 냠냠~
    koreanShortHair.sleep()         // 치즈, 0살, 고양이: 쿨쿨~

    var retriever: Retriever = Retriever("찹쌀떡") // 리트리버 생성
    retriever.species = "개"         // 종을 개로 변경
    retriever.seeFriend()           // 찹쌀떡, 3살, 개: 자리에 앉기
                                    // 찹쌀떡, 3살, 개: 월! 월!
    retriever.eatFood()             // 찹쌀떡, 3살, 개: 냠냠~
                                    // 찹쌀떡, 3살, 개: 와그작 와그작!
    retriever.sleep()               // 찹쌀떡, 3살, 개: 쿨쿨~

    //var animal: Animal = Animal("동물")   // Animal은 추상 클래스이므로 인스턴스를 생성할 수 없다.

    var animal: Animal = KoreanShortHair("턱시도") // 코리안 숏 헤어를 생성할 때 업 캐스팅
    animal.age = 4          // 나이를 4살로 설정
    animal.seeFriend()      // 턱시도, 4살, 고양이: 야옹~
    animal.eatFood()        // 턱시도, 4살, 고양이: 냠냠~
    animal.sleep()          // 턱시도, 4살, 고양이: 쿨쿨~
}