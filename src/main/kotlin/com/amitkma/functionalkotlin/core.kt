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


