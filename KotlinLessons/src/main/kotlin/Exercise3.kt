package org.example

fun main() {
    var whileVar = 8

    do {
        println("do-while: ${whileVar--}")
    } while (false)

    while(whileVar>3) {
        println("while: ${whileVar--}")
    }

    val forVar = 10

    for (i in 1..forVar){
        println("for in .. $i")

    }

    for (i in forVar downTo 1){
        println("for in downTo: $i")
    }

    for (i in 1 until forVar step 2){
        println("for in until + step: $i")
    }


//    Напишите программу, которая выводит первые 10 натуральных чисел, используя цикл for.

    for(i in 1..10){
        println(i)
    }

//    Создайте программу, которая вычисляет факториал числа, используя цикл while.
    var f = readln().toInt()
    var result = 1
    var m = f

    while (f > 1) {
        result *= f
        f--
    }

    println("Factorial of $m: $result")

//    Напишите программу, которая выводит последовательность Фибоначчи до заданного числа, используя циклы.
    print("Введите число: ")
    val limit = readln().toInt()

    var a = 0
    var b = 1

    print("Последовательность Фибоначчи: $a $b ")

    while (true) {
        val next = a + b
        if (next > limit) break
        print("$next ")
        a = b
        b = next
    }
}