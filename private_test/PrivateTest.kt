package org.example.private_test

// A, B, c, d 모두 다른 패키지에 있으므로 import로 등록을 해줘야 한다.
import org.example.A
import org.example.B
import org.example.c    // c는 private이므로 다른 파일에서는 접근 불가능
import org.example.d    // d는 private이므로 현재 파일에서는 접근 가능

fun main() {
    println(A().a)      // a는 private이므로 현재 파일에서는 접근 불가능
    println(A().b())    // b는 private이므로 현재 파일에서는 접근 불가능
    println(c)          // c는 private이므로 현재 파일에서는 접근 불가능
    println(d())        // d는 private이므로 현재 파일에서는 접근 불가능
    println(B().e())    // e는 public이므로 실행 가능하지만, e() 내부에서 a와 b가 private이므로 실행 불가능
}