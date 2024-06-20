package com.example.mourishkannatraining.kotlinexamples

fun main() {
    println(double(40))
    tempToday("mon",32)
    drive(mph=10, speed = "slow")
    val s = Square(10)

    var name:String = "Mourish kanna"
    println(name.commaSeperated("some other string"))

    var a  = "mourish"
    for (i in 3..6 step 2) print(i)


    val numberOfDogs:Int = 3
    val numberOfCats = 2
    println(" I have $numberOfDogs of dogs and $numberOfCats of cats")
}

fun printHello(name: String?) {
    println("Hi there!")
}

fun drive(speed: String = "fast",mph:Int) {
    println("driving $speed")
}

fun tempToday(day: String, temp: Int) {
    println("Today is $day and it's $temp degrees.")
}


fun double(x: Int) = x * 2

fun String.commaSeperated(values:String):String{
    return  "comma seperated string --"+ values

}

class Square(val side: Int) {
    init {
        println(side * 2)
    }
}