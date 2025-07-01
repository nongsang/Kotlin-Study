package org.example

fun main() {
    val list = listOf("서울", "부산", "인천", "광주", "제주")

    // 리스트의 갯수로 횟수를 표현 및 원소에 직접 접근하려는 의도는 알겠으나 코틀린에서는 별로 좋지 못한 접근법이다.
    for(city in 0..<list.size) {
        println("[$city] ${list[city]}")
    }

    println()

    // 원소의 인덱스만 순회하는 방법도 있고,
    for(city in list.indices) {
        println("[$city] ${list[city]}")
    }

    println()

    // 인덱스와 원소를 쌍으로 순회하는 방법도 있다.
    for((i, city) in list.withIndex()) {
        println("[$i] $city")
    }

    println()

    // 모든 원소를 순회하여 어떤 작업을 반복적으로 하게 한다면, 함수형 프로그래밍 방식을 사용하면 더 깔끔한 코드를 작성할 수 있다.
    list.forEachIndexed { i, city ->
        println("[$i] $city")
    }

    // map도 for문으로 순회할 수 있다.
    val map = mapOf(
        "i" to "Int",
        "l" to "Long",
        "f" to "Float",
        "d" to "Double"
    )

    // map의 entries로 순회한다면 key와 value라는 식별자로 호출하는 것보다,
    for (entry in map.entries) {
        println("${entry.key} : ${entry.value}")
    }

    println()

    // key, value 쌍을 사용해서 순회하고 사용하는 것이 더 명확하다.
    for ((name, type) in map) {
        println("$name : $type")
    }

    println()

    // 함수형 프로그래밍 방식으로 forEach{}를 사용한다면 더 깔끔한 코드를 작성할 수 있다.
    map.forEach { (name, type) ->
        println("$name : $type")
    }
}