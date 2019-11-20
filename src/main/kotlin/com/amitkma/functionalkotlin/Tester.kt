package com.amitkma.functionalkotlin

val double: (Int) -> Int = { a -> 2 * a }
val repeat: (String) -> String = { a -> a.plus(a) }

val concat: (String) -> (String) -> String = { a -> { b -> a.plus(b) } }

fun main() {

    // Test basic combinators
    println(id("Identity Function"))
    println(mock(id)("Identity of Identity Function"))
    println(mock(double)(3))
    println(mock(repeat)("FunctionalKotlin"))

    // Test boolean combinators
    println(lTrue("tweet")("chirp") === "tweet")
    println(lFalse("tweet")("chirp") === "chirp")

    // Test flip function
    println(flip(lTrue)("tweet")("chirp") === "chirp")
    println(flip(lFalse)("tweet")("chirp") === "tweet")
}