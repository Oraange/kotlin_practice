package com.example.orangepractice

// comanion object
// java의 static 대신에 사용
// 정적인 객체나 메소드를 선언할 때 사용

class Book private constructor(val id: Int, val name: String) {
    companion object BookFactory: IdProvider {
        override fun getId(): Int {
            return 444
        }
        val myBook: String = "new book"
        fun create(): Book = Book(getId(), myBook)
    }
}

interface IdProvider {
    fun getId(): Int
}

fun main() {
    val book = Book.create()

    val bookId = Book.BookFactory.getId()
    println("Book's id: ${book.id}\nBook's name: ${book.name}")
}
