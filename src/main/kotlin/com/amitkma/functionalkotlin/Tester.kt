package com.amitkma.functionalkotlin

val double: (Int) -> Int = { a -> 2*a }
val repeat: (String) -> String = { a -> a.plus(a)}

fun main() {
    println(mock(id)("3"))
    println(mock(double)(2))
    println(mock(repeat)("amit"))
}
