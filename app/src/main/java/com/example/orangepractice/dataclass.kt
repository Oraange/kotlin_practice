package com.example.orangepractice

data class Ticket(
    val companyName: String,
    val name: String,
    var date: String,
    var seatNumber: Int
)

class TicketNormal(
    val companyName: String,
    val name: String,
    var date: String,
    var seatNumber: Int
)

// toString(), hashCode(), equals(), copy() 함수가 자동으로 만들어짐

fun main() {
    val ticketA = Ticket(
        "KoreanAir",
        "Orange",
        "2023-06-04",
        14
    )
    val ticketB = TicketNormal(
        "KoreanAir",
        "Orange",
        "2023-06-04",
        14
    )

    println(ticketA) // Ticket(companyName=KoreanAir, name=Orange, date=2023-06-04, seatNumber=14)
    println(ticketB) // com.example.orangepractice.TicketNormal@58ceff1
}
