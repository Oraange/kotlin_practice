package com.example.orangepractice

// 1. Lamda
// 람다식은 우리가 마치 value 처럼 다룰 수 있는 익명함수이다.
// 1) 메소드의 파라미터로 넘겨줄 수 있다.
// - fun maxBy(a: Int)와 같은 함수 선언의 파라미터에 fun maxBy(myFun: fun) 이런 식으로
// 2) return 값으로 사용할 수 있다.

// Lamda의 기본 정의
// val lamdaName: Type = { argumentList -> codeBody }

val square: (Int) -> (Int) = { number: Int -> number*number }

val nameAge: (String, Int) -> String = { name: String, age: Int  ->
    "my name is ${name}. I'm ${age}"
}

fun main() {
    println(square(12))
    println(nameAge("Orange", 30))

    val a = "Orange said"
    val b = "Him said"
    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())

    println(extendString("Orange", 30))

    println(calculateGrade(98))
    println(calculateGrade(1000))

    val lamb = { number: Double ->
        number == 4.3213
    }
    println(invokeLambda(lamb))
    //invokeLambda({ it > 1.111 })과 같은 표현
    println(invokeLambda { it > 1.111 })
}

// 확장함수
val pizzaIsGreat: String.() -> String = {
    this + " Pizza is the best!"
}

fun extendString(name: String, age: Int): String {
    val introduceMySelf: String.(Int) -> String = {
        "I am ${this} and ${it} years old"
    }
    return name.introduceMySelf(age)
}

// 람다의 return
val calculateGrade: (Int) -> String = {
    when(it) {
        in 0..40 -> "fail"
        in 41..71 -> "pass"
        in 71..100 -> "perfect"
        else -> "Error" // else가 없으면 when에 걸리는 것이 없으므로 return이 없어진다. 따라서 꼭 써줘야 함
    }
}

fun invokeLambda(lamb: (Double) -> Boolean): Boolean {
    return lamb(5.2343)
}

// pojo class(비어있는 틀 역할을 하는 class)


