package org.example


fun main() {
//  1 Создайте переменные разных типов (Int, String, Boolean, Double) с использованием val и var и продемонстрируйте их различия.
    val integerVal: Int = 4
    val stringVal: String = "Hello"
    val booleanVal: Boolean = true
    val doubleVal: Double = 3.0
    val floatVal: Float = 3.0f
    var integerVar = 4

    // integerVal = 3 // error
    integerVar = 2 // no error


//  2 Напишите программу, которая вычисляет площадь прямоугольника, используя переменные для длины и ширины.
    val length = 5
    val width = 5
    val S = (1.0 / 2.0) * length * width
    println(S)

//  3 Создайте программу, которая преобразует температуру из Цельсия в Фаренгейт, используя формулу: F = C × 9/5 + 32.
    val celsius = 30.0
    val fahrenheit = celsius * (9.0 / 5.0) + 32
    println(fahrenheit)

//  4 Напишите программу, которая меняет значения двух переменных без использования третьей переменной
    var a = 3
    var b = 2
    println("a = $a b = $b")
    a += b
    b = a - b
    a -= b
    println("a = $a b = $b")

//  5 Создайте программу, демонстрирующую автоматический вывод типа в Kotlin, объявляя переменные без явного указания типов.
    val integerValSecond = 4
    val stringValSecond = "Hello"
    val booleanValSecond = true
    val doubleValSecond = 3.0
    val floatValSecond = 3.0f
    var integerVarSecond = 4

//  6 Создайте переменную для хранения возраста человека и еще одну для его имени, затем выведите предложение, представляющее этого человека.
    val age = 42
    val firstName = "John"
    println("Hello $firstName, your age $age")

//  7 Напишите программу, которая вычисляет и отображает результат сложения, вычитания, умножения и деления двух чисел.
    val numberOne = 20.0
    val numberTwo = 30.0
    println("* ${numberOne * numberTwo}")
    println("+ ${numberOne + numberTwo}")
    println("- ${numberOne - numberTwo}")
    println("/ ${numberOne / numberTwo}")

}