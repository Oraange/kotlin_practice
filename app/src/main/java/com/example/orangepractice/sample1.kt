package com.example.orangepractice

fun main() {
//    forAndWhile()
//    nullcheck()
    ignoreNulls("hello")
}

// 5. Array and List

// Array

// - List
//   - Immutable list
//   - Mutable list

fun array() {
    val array = arrayOf(1, 2, 3)
    val list = listOf(1, 2, 3)

    val array2 = arrayOf(1, "d", 3.4f)
    val list2 = listOf(1, "d", 11L)

    array[0] = 3
    var result = list.get(0) // list는 interface이기 때문에 get은 있지만 set은 없음

    val arrayList = arrayListOf<Int>() // Mutable list의 대표적인 예
    arrayList.add(10)
    arrayList.add(20)
    arrayList[0] = 100

    // 주소값을 참조하기 때문에 var를 써도 되고 val를 써도 된다.
    // 단, arrayList = arrayListOf() 는 에러가 난다.
}

// 6. For & While

fun forAndWhile() {
    val students = arrayListOf("joyce", "james", "jenny", "jennifer")

    for ( name in students ) {
        println("${name}")
    }

    for ( (index, name) in students.withIndex() ) {
        print("${index+1}번 째 학생: ${name}\n")
    }

    var sum: Int = 0

    // 1부터 10까지의 합
    for ( i in 1..10 ) {
        sum += i
    }
    println("sum = ${sum}") // result: 55
    sum = 0

    // 1부터 10까지 2씩 건너뛴 수의 합(1, 3, 5, 7, 9)
    for ( i in 1..10 step 2 ) {
        sum += i
    }
    println("sum = ${sum}") // result: 25
    sum = 0

    // 10부터 1까지 1씩 감소하면서 더한 값(10, 9, .., 1)
    for ( i in 10 downTo 1 ) {
        sum += i
    }
    println("sum = ${sum}") // result: 55
    sum = 0

    // 1부터 100 미만 까지의 합(1, 2, .., 99)
    for ( i in 1 until 100 ) {
        sum += i
    }
    println("sum = ${sum}") // result: 4950
    sum = 0

    var index = 0
    while ( index < 10 ) {
        println("current index: ${index}")
        index++
    }
}

// 7. Nullable / NonNull ( 정말 중요!! )

fun nullcheck() {
    // NPE: NULL pointer Exception
    // 런타임에서만 알 수 있던 에러 -> 코틀린에서 이걸 컴파일 단계에서 알 수 있도록 만듦

    var name: String = "Orange" // 기본적으로 Non-Null Type
    // var nullName: String = null // 에러 발생(Non-Null Type)
    var nullName: String? = null // Null을 넣고 싶으면 "?"를 넣으면 된다.
    var nameInUpperCase = name.uppercase()
    var nullNameInUpperCase = nullName?.uppercase() // "?"를 넣으면 nullName이 Null일 때,
    // nullNameInUpperCase도 Null이 되고, 아니면 대문자로 변경한다.

    // ?: Elvis PRESLEY 연산자
    val lastName: String? = "Song"
    val fullName = name + " " + (lastName?: "No lastName") // lastName이 Null이면 "No lastName"이 출력된다.

    println(fullName)

}

// !!: Not null assertion operator(절대 Null이 올 수 없다는 것을 알려주는 연산자)
fun ignoreNulls(str: String?) {
    val mNotNull: String = str!!
    val upper = mNotNull.uppercase()

    val email: String? = "hrpp11xx@gmail.com"
    email?.let{
        // let: 자신의 리시버 객체를 람다식 내부로 옮겨서 실행하는 구문
        println("My email is ${email}")
    } // email이 Null이 아니면 다음을 실행해라
}
