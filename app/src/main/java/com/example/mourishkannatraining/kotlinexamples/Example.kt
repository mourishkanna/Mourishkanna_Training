package com.example.mourishkannatraining.kotlinexamples

fun main() {
    println("Hi this is MK");
    var myStudent: Student = Student("Mourish",20,"Erode");
    println(myStudent.name);
    myStudent.name = "Kanna";
    println(myStudent.name);

    var myEmployee: Employee = Employee("Shivaram",21,"Kanniyakumari")
    println(myEmployee.getName())
    println(myEmployee.name)
}