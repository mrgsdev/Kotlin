package org.example

fun main() {
    // Напишите программу, которая определяет, является ли год високосным, используя выражения if-else
//    val year = 2000
//    if (year % 400 == 0) {
//        println("$year Високосный")
//    } else if (year % 100 == 0) {
//        println("$year Не високосный")
//    } else if (year % 4 == 0) {
//        println("$year Не високосный")
//    } else {
//        println("$year Не високосный")
//    }
//
//
//    val answer = if (year % 400 == 0) {
//        "$year Високосный"
//    } else if (year % 100 == 0) {
//        "$year Не високосный"
//    } else if (year % 4 == 0) {
//        "$year Не високосный"
//    } else {
//        "$year Не високосный"
//    }
//
//    println(answer)
//
//
//    val answerWhen = when {
//        (year % 400 == 0) -> "$year Високосный"
//        (year % 100 == 0) -> "$year Не високосный"
//        (year % 4 == 0) -> "$year Не високосный"
//        else -> "$year Не високосный"
//    }
//    println(answerWhen)
//
//
//    //Создайте программу, которая отображает сообщение на основе оценки студента (A, B, C, D или F), используя выражение `when`.
//    when (val score = "A") {
//        "A" -> println("Вы получили $score")
//        "B" -> println("Вы получили $score")
//        "C" -> println("Вы получили $score")
//        "D" -> println("Вы получили $score")
//        "F" -> println("Вы получили $score")
//    }
//
////    Напишите программу, которая находит максимальное из трех чисел, используя if-else
//
//    val numberOne = readln().toDouble()
//    val numberTwo = readln().toDouble()
//    val numberThree = readln().toDouble()
//
//    var max = numberOne
//
//    if (numberTwo > max) {
//        max = numberTwo
//    }
//    if (numberThree > max) {
//        max = numberThree
//    }
//    println("MAX = $max")
//
//
////    Создайте простой калькулятор, который выполняет операции (+, -, *, /) на основе ввода пользователя, используя `when`.
//    print("Введите первое число ")
//    val numberOneCal = readln().toDouble()
//    print("Введите второе число ")
//    val numberTwoCal = readln().toDouble()
//
//
//
//
//    when (readln()) {
//        "+" -> println(numberOneCal + numberTwoCal)
//        "-" -> println(numberOneCal - numberTwoCal)
//        "*" -> println(numberOneCal * numberTwoCal)
//        "/" -> if (numberTwoCal != 0.0) println(numberOneCal.toDouble() / numberTwoCal) else println("Деление на ноль запрещено")
//        else -> println("Введите только (+, -, *, /)")
//    }

//    Напишите программу, которая определяет, является ли число положительным, отрицательным или нулем.
//    val n = readln().toDouble()
//    when {
//        (n > 0) -> println("Число $n положительное")
//        (n < 0) -> println("Число $n отрицательное")
//        (n == 0.0) -> println("Число $n нулем")
//    }

//    Создайте программу, которая проверяет, имеет ли человек право голосовать, на основе его возраста и гражданства.
    println("Введите возраст ")
    val age = readln()
    println("Введите страну ")
    val age = readln()


}
