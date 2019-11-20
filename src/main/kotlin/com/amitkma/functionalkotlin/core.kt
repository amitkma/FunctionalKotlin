package com.amitkma.functionalkotlin

// λa.a
val id: (Any) -> Any = { a -> a }

// λf.ff
fun <T> mock(function: ((T) -> T)): (T) -> T = { t: T -> function(function(t)) }
