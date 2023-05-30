package com.example.orangepractice

open class Human (val name: String = "Anonymous") {
    constructor(name: String, age: Int): this(name) {
        println("My name is ${name}, ${age}years old")
    }
    init { // 부 생성자가 아무리 많아도 주 생성자가 먼저 호출된다.
        println("New human has been born.")
    }

    fun eatingCake() {
        println("This is so YUMMY")
    }

    open fun singASong() {
        println("la-la-la")
    }
}

// 코틀린의 기본 class는 final 클래스이다.
// 아무리 같은 파일 내에 있더라도 접근이 불가함.
// 따라서 상속받고자 하는 클래스 앞에 "open"이라는 예약어를 넣어야 한다.
class Korean: Human() {
    override fun singASong() {
        super.singASong() // 부모 클래스의 메소드를 사용하기 위함
        println("라라라") // 자식 클래스만의 메소드를 사용하기 위해 부모 클래스의 메소드를 오버라이드
        println("My nam is ${name}")
    }
}

fun main() {
//    val human = Human("minsu")
//    val stranger = Human()
//    human.eatingCake()

    val friend = Human("Hayoung", 30)
//    println("This human's name is ${stranger.name}")
    val korean = Korean()
    korean.singASong()
}