package com.amitkma.functionalkotlin

val double: (Int) -> Int = { a -> 2 * a }
val repeat: (String) -> String = { a -> a.plus(a) }

val concat: (String) -> (String) -> String = { a -> { b -> a.plus(b) } }

fun main() {

    // Test basic combinator's
    println(id("Identity Function"))                            // Prints -> Identity Function
    println(mock(id)("Identity of Identity Function"))          // Prints -> Identity of Identity Function
    println(mock(double)(3))                                    // Prints -> 12
    println(mock(repeat)("FunctionalKotlin"))                   // Prints -> FunctionalKotlinFunctionalKotlinFunctionalKotlinFunctionalKotlin

    // Test boolean combinator's
    println(lTrue("tweet")("chirp") === "tweet")                // Prints -> true
    println(lFalse("tweet")("chirp") === "chirp")               // Prints -> true

    // Test flip function
    println(flip(lTrue)("tweet")("chirp") === "chirp")          // Prints -> true
    println(flip(lFalse)("tweet")("chirp") === "tweet")         // Prints -> true
}