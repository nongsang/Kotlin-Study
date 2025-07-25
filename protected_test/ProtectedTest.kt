package org.example.protected_test

// A, B, C 모두 다른 패키지에 있으므로 import로 등록을 해줘야 한다.
import org.example.A
import org.example.B
import org.example.C

fun main() {
    println(A().a)      // a는 protected이므로 현재 파일에서는 접근 불가능
    println(A().b())    // b는 protected이므로 현재 파일에서는 접근 불가능
    println(B().e())    // e는 public이므로 실행 가능
    println(C().f())    // f는 public이므로 실행 가능
}