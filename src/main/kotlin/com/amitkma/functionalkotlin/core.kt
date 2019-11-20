package com.amitkma.functionalkotlin

/**
 * Basic Combinators
 * BEGIN
 * */

// λa.a (known as identity combinator)
val id: (Any) -> Any = { a -> a }

// λf.ff (known as self application or mockingbird combinator)
fun <T> mock(function: ((T) -> T)): (T) -> T = { t: T -> function(function(t)) }

/**
 * END
 * */

/**
 * Booleans as a function
 * BEGIN
 */
// λab.a
// It takes two values "thn" and "els" and returns the first.
val lTrue: (Any) -> (Any) -> Any = { thn -> { _ -> thn } }

// λab.b
// It takes two values "thn" and "els" and returns the second.
val lFalse: (Any) -> (Any) -> Any = { _ -> { els -> els } }

/**
 * END
 */

// λfab.fba
// It is also known as cardinal combinator. It takes a binary function (two argument function)
// and produce a function with reversed argument order.
fun <P1, P2, R> flip(function: (P1) -> (P2) -> R): (P2) -> (P1) -> R = { p2: P2 -> { p1: P1 -> function(p1)(p2) } }

// Same as above flip function but in a non curried way.
fun <P1, P2, R> flip(function: (P1, P2) -> R): (P2, P1) -> R = { p2: P2, p1: P1 -> function(p1, p2) }