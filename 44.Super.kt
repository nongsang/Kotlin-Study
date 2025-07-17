package org.example

open class Dog(val name: String) {
    open fun seeFriend() {
        println("$name: 꼬리를 흔든다.")
    }
}

class Retriever(name: String) : Dog(name) {
    override fun seeFriend() {
        println("$name: 월! 월!")
        super.seeFriend()           // super 키워드를 사용하여 부모 클래스를 지정하여 기능을 사용할 수 있다.
    }
}

class Samoyed(name: String) : Dog(name) {    // 할당받은 이름에 추가 가공하여 Dog의 생성자로 전달할 수 있다.
    override fun seeFriend() {
        super.seeFriend()               // 부모 클래스의 seeFriend() 기능을 먼저 호출한다.
        println("$name: 자리에 앉는다.")
    }
}

fun main() {
    var retriever: Retriever = Retriever("인절미")    // 리트리버 생성
    retriever.seeFriend()                                   // 인절미: 월! 월!
                                                            // 인절미: 꼬리를 흔든다.

    var samoyed: Samoyed = Samoyed("겨울이")  // 사모예드 생성
    samoyed.seeFriend()                             // 겨울이: 꼬리를 흔든다.
                                                    // 겨울이: 자리에 않는다.

    var dog: Dog = Dog("개")                 // 그냥 개를 생성
    dog.seeFriend()                                 // 개: 꼬리를 흔든다.
}