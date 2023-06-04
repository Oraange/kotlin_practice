package com.example.orangepractice

object CarFactory {
    val cars = mutableListOf<Car>()

    fun makeCar(horsePower: Int): Car {
        var car = Car(horsePower)
        cars.add(car)
        return car
    }
}

// object가 다른 class와 다른 점
// - carFactory라는 객체는 앱을 실행할 때 딱 한번 만들어진다.(Singleton Pattern)
// - 불필요하게 메모리가 사용되는 것을 막을 수 있다.

data class Car(val horsePower: Int)

fun main() {
    val car = CarFactory.makeCar(10)
    val car2 = CarFactory.makeCar(200)

    println(car)
    println(car2)
    println(CarFactory.cars.size.toString())
}
