package org.example

// 자바 수학 기능 추가
import java.math.BigInteger
import java.math.BigDecimal

fun main() {
    val i = 10
    val l = 10L
    val d = 10.0
    val f = 10.0F

    val bi1: BigInteger = BigInteger.valueOf(123)   // BigInteger는 Int 값으로 생성하려면 valueOf() 생성자를 호출해야한다.
    val bi2: BigInteger = BigInteger("123")
    val bi3: BigInteger = i.toBigInteger()
    val bi4: BigInteger = l.toBigInteger()

    val bd1: BigDecimal = BigDecimal(123)       // BigDecimal은 BigInteger와 달리 Int로 생성할 수 있다.
    val bd2: BigDecimal = BigDecimal("123.00")
    val bd3: BigDecimal = i.toBigDecimal()
    val bd4: BigDecimal = l.toBigDecimal()
    val bd5: BigDecimal = d.toBigDecimal()
    val bd6: BigDecimal = f.toBigDecimal()

    // 연산도 일반 변수와 같은 연산자로 연산할 수 있다.
}