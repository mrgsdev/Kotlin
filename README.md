![image](https://github.com/user-attachments/assets/873146dd-7cc2-42f0-bf6e-aae91f0e4417)

# План обучения Kotlin для новичка

Kotlin — современный язык программирования, который стал официальным языком для Android-разработки. Вот структурированный план обучения, который поможет вам систематически освоить Kotlin с нуля.

## Этап 1: Основы Kotlin (2-3 недели)

### Неделя 1: Знакомство с языком
- [x] [Установка среды разработки (IntelliJ IDEA или Android Studio)](https://github.com/mrgsdev/Kotlin/blob/main/Theory/install-kotlin-dev-environment.md)
- [x] [Синтаксис языка и его отличия от других языков](https://github.com/mrgsdev/Kotlin/blob/main/Theory/kotlin-vs-swift-syntax.md)
- [x] [Переменные и типы данных (val, var, String, Int, Boolean)](https://github.com/mrgsdev/Kotlin/blob/main/Theory/1kotlin-variables-types.md)
- [x] [Условные выражения (if, when)](https://github.com/mrgsdev/Kotlin/blob/main/Theory/kotlin-conditionals.md)
- Циклы (for, while, do-while)
- Функции и их объявление
- Практика: создание простых консольных приложений

### Неделя 2-3: Особенности Kotlin
- Null-безопасность (nullable типы, операторы `?.`, `?:`, `!!`)
- Коллекции (List, Map, Set) и операции с ними
- Работа со строками и шаблонами строк
- Диапазоны (ranges) и прогрессии
- Лямбда-выражения и функции высшего порядка
- Расширения (extension functions)
- Практика: решение алгоритмических задач с использованием особенностей Kotlin

## Этап 2: Объектно-ориентированное программирование в Kotlin (3-4 недели)

### Неделя 4-5: Основы ООП
- Классы и объекты
- Конструкторы и инициализация
- Наследование и интерфейсы
- Модификаторы доступа
- Свойства и поля
- Методы и функции-члены класса
- Практика: создание иерархии классов для моделирования предметной области

### Неделя 6-7: Продвинутые концепции ООП
- Data классы
- Sealed классы
- Object и companion object
- Делегирование свойств
- Enum классы
- Вложенные и внутренние классы
- Анонимные классы
- Практика: рефакторинг существующего кода с использованием продвинутых возможностей языка

## Этап 3: Функциональное программирование в Kotlin (2-3 недели)

### Неделя 8-9: Функциональные возможности
- Функции как объекты первого класса
- Функции высшего порядка подробнее
- Операции map, filter, reduce и другие
- Последовательности (sequences)
- Currying и частичное применение функций
- Композиция функций
- Практика: переписывание императивного кода в функциональном стиле

### Неделя 10: Корутины
- Концепция асинхронного программирования
- Основы корутин
- Контекст и диспетчеры корутин
- Обработка ошибок в корутинах
- Каналы и потоки
- Практика: создание асинхронного приложения с использованием корутин

## Этап 4: Практические проекты (4+ недели)

### Неделя 11-12: Консольные приложения
- Работа с аргументами командной строки
- Файловый ввод-вывод
- Сериализация и десериализация (JSON/XML)
- Практика: создание утилиты командной строки

### Неделя 13-14: Разработка под Android (опционально)
- Основы Android-разработки
- Активности и фрагменты
- Layouts и UI-компоненты
- Использование Kotlin для Android
- Практика: создание простого Android-приложения

### Неделя 15-16: Серверная разработка (опционально)
- Введение в Ktor или Spring Boot
- Создание RESTful API
- Работа с базами данных (JDBC, Exposed)
- Практика: разработка бэкенда для веб-приложения

## Рекомендуемые ресурсы для обучения:

### Документация и учебники:
- Официальная документация Kotlin (kotlinlang.org)
- Kotlin Koans (онлайн-упражнения для изучения Kotlin)
- "Kotlin in Action" (книга Дмитрия Жемерова и Светланы Исаковой)

### Онлайн-курсы:
- "Kotlin for Java Developers" на Coursera
- "Kotlin Bootcamp for Programmers" от Google
- Курсы на Udemy, Pluralsight и других платформах

### Практика:
- Codewars, LeetCode, HackerRank — для решения алгоритмических задач
- GitHub — изучение открытого кода на Kotlin
- Личные проекты — применение полученных знаний на практике

## Советы для эффективного обучения:

1. Практикуйтесь ежедневно, даже если это будет небольшая задача
2. Читайте исходный код других программистов на GitHub
3. Участвуйте в Kotlin-сообществах (Reddit, Stack Overflow)
4. Ведите свой дневник обучения или блог о изучении Kotlin
5. Пишите код с нуля, а не только копируйте примеры
6. Объясняйте концепции другим — это лучший способ закрепить свои знания

# Упражнения для изучения Kotlin

## Основы Kotlin

### [Упражнение 1: Переменные и типы данных](https://github.com/mrgsdev/Kotlin/blob/main/KotlinLessons/src/main/kotlin/Exercise1.kt)
1. Создайте переменные разных типов (Int, String, Boolean, Double) с использованием `val` и `var` и продемонстрируйте их различия.
```kotlin
    val integerVal: Int = 4
    val stringVal: String = "Hello"
    val booleanVal: Boolean = true
    val doubleVal: Double = 3.0
    val floatVal: Float = 3.0f
    var integerVar = 4

    // integerVal = 3 // error
    integerVar = 2 // no error
```
3. Напишите программу, которая вычисляет площадь прямоугольника, используя переменные для длины и ширины.
   ```kotlin
    val length = 5
    val width = 5
    val S = (1.0 / 2.0) * length * width
    println(S)
   ```
4. Создайте программу, которая преобразует температуру из Цельсия в Фаренгейт, используя формулу: F = C × 9/5 + 32.
   ```kotlin
    val celsius = 30.0
    val fahrenheit = celsius * (9.0 / 5.0) + 32
    println(fahrenheit)
   ```
5. Напишите программу, которая меняет значения двух переменных без использования третьей переменной.
```kotlin
    var a = 3
    var b = 2
    println("a = $a b = $b")
    a += b
    b = a - b
    a -= b
    println("a = $a b = $b")
```
6. Создайте программу, демонстрирующую автоматический вывод типа в Kotlin, объявляя переменные без явного указания типов.
```kotlin
    val integerValSecond = 4
    val stringValSecond = "Hello"
    val booleanValSecond = true
    val doubleValSecond = 3.0
    val floatValSecond = 3.0f
    var integerVarSecond = 4
   ```
7. Создайте переменную для хранения возраста человека и еще одну для его имени, затем выведите предложение, представляющее этого человека.
```kotlin
    val age = 42
    val firstName = "John"
    println("Hello $firstName, your age $age")
```
8. Напишите программу, которая вычисляет и отображает результат сложения, вычитания, умножения и деления двух чисел.
```kotlin
    val numberOne = 20.0
    val numberTwo = 30.0
    println("* ${numberOne * numberTwo}")
    println("+ ${numberOne + numberTwo}")
    println("- ${numberOne - numberTwo}")
    println("/ ${numberOne / numberTwo}")
``` 


### [Упражнение 2: Условные выражения](https://github.com/mrgsdev/Kotlin/blob/main/KotlinLessons/src/main/kotlin/Exercise2.kt)
1. Напишите программу, которая определяет, является ли год високосным, используя выражения if-else.
   ```kotlin
 
    // Напишите программу, которая определяет, является ли год високосным, используя выражения if-else
    val year = 2000
    if (year % 400 == 0) {
        println("$year Високосный")
    } else if (year % 100 == 0){
        println("$year Не високосный")
    } else if (year % 4 == 0){
        println("$year Не високосный")
    } else {
        println("$year Не високосный")
    }


    val answer = if (year % 400 == 0) {
        "$year Високосный"
    } else if (year % 100 == 0){
        "$year Не високосный"
    } else if (year % 4 == 0){
        "$year Не високосный"
    } else {
        "$year Не високосный"
    }

    println(answer)


    val answerWhen = when {
        (year % 400 == 0) -> "$year Високосный"
        (year % 100 == 0) -> "$year Не високосный"
        (year % 4 == 0) -> "$year Не високосный"
        else -> "$year Не високосный"
    }
    println(answerWhen)
   ```
3. Создайте программу, которая отображает сообщение на основе оценки студента (A, B, C, D или F), используя выражение `when`.
      ```kotlin
    when(val score = "A") {
        "A" -> println("Вы получили $score")
        "B" -> println("Вы получили $score")
        "C" -> println("Вы получили $score")
        "D" -> println("Вы получили $score")
        "F" -> println("Вы получили $score")
    }
   ```
5. Напишите программу, которая находит максимальное из трех чисел, используя if-else.
  ```kotlin
    val numberOne = readln().toDouble()
    val numberTwo = readln().toDouble()
    val numberThree = readln().toDouble()

    var max = numberOne

    if (numberTwo > max) {
        max = numberTwo
    }
    if (numberThree > max) {
        max = numberThree
    }
    println("MAX = $max")
   ```
6. Создайте простой калькулятор, который выполняет операции (+, -, *, /) на основе ввода пользователя, используя `when`.
 ```kotlin
    print("Введите первое число ")
    val numberOneCal = readln().toDouble()
    print("Введите второе число ")
    val numberTwoCal = readln().toDouble()

    when(readln()) {
        "+" -> println(numberOneCal + numberTwoCal)
        "-" -> println(numberOneCal - numberTwoCal)
        "*" -> println(numberOneCal * numberTwoCal)
        "/" -> if (numberTwoCal != 0.0)  println(numberOneCal.toDouble() / numberTwoCal) else println("Деление на ноль запрещено")
        else -> println("Введите только (+, -, *, /)")
    }
   ```
   
8. Напишите программу, которая определяет, является ли число положительным, отрицательным или нулем.
 ```kotlin
   val n = readln().toDouble()
    when {
        (n > 0) -> println("Число $n положительное")
        (n < 0) -> println("Число $n отрицательное")
        (n == 0.0) -> println("Число $n нулем") 
    }
   ```
10. Создайте программу, которая проверяет, имеет ли человек право голосовать, на основе его возраста и гражданства.
 ```kotlin
    print("Введите ваш возраст: ")
    val age = readln().toInt()
    print("Вы гражданин этой страны? (да/нет): ")
    val isEligible = age >= 18 && readln().lowercase() == "да"
    when (isEligible) {
        true -> println("Вы имеете право голосовать!")
        false -> println("Вы не имеете права голосовать.")
    }
 ```
### Упражнение 3: Циклы
1. Напишите программу, которая выводит первые 10 натуральных чисел, используя цикл for.
2. Создайте программу, которая вычисляет факториал числа, используя цикл while.
3. Напишите программу, которая выводит последовательность Фибоначчи до заданного числа, используя циклы.
4. Создайте программу, которая выводит таблицу умножения для заданного числа, используя циклы.
5. Напишите программу, которая находит все простые числа от 1 до 100, используя циклы и условия.
6. Создайте программу, которая выводит узор из звездочек (астерисков), образующих треугольник.
7. Напишите программу, которая переворачивает число, используя цикл while (например, 1234 становится 4321).
8. Создайте программу, которая вычисляет сумму всех четных чисел от 1 до 100, используя циклы.
9. Напишите программу, которая симулирует простую игру-угадайку, используя цикл do-while.
10. Создайте программу, которая продолжает запрашивать ввод, пока не будет введено определенное слово, используя цикл while.

### Упражнение 4: Функции
1. Напишите функцию, которая вычисляет площадь круга по заданному радиусу.
2. Создайте функцию, которая проверяет, является ли строка палиндромом.
3. Напишите функцию, которая подсчитывает количество гласных в строке.
4. Создайте рекурсивную функцию для вычисления факториала числа.
5. Напишите функцию с параметрами по умолчанию, которая вычисляет объем коробки.
6. Создайте функцию, которая принимает переменное количество целых чисел (vararg) и возвращает их среднее значение.
7. Напишите функцию-расширение для типа String, которая подсчитывает количество слов в ней.
8. Создайте функцию высшего порядка, которая применяет заданную операцию ко всем элементам массива.
9. Напишите функцию, которая проверяет адрес электронной почты с помощью регулярных выражений.
10. Создайте функцию с именованными параметрами для форматирования полного имени человека из компонентов: имя, отчество и фамилия.

### Упражнение 5: Null-безопасность
1. Создайте программу, демонстрирующую оператор безопасного вызова (`?.`) с nullable переменными.
2. Напишите функцию, которая безопасно обращается к свойствам nullable объекта с помощью оператора Элвиса (`?:`).
3. Создайте программу, которая намеренно вызывает NullPointerException, используя оператор утверждения ненулевого значения (`!!`).
4. Напишите код, демонстрирующий проверку на null перед выполнением операций.
5. Создайте цепочку nullable объектов и безопасно обратитесь к свойству, используя несколько операторов безопасного вызова.
6. Напишите функцию, которая принимает nullable строку и возвращает её длину или значение по умолчанию, если строка равна null.
7. Создайте программу, демонстрирующую различия между `let`, `also`, `apply`, `run` и `with` при обработке nullable типов.
8. Напишите код, который преобразует nullable строку в целое число с правильной обработкой null.
9. Создайте программу, демонстрирующую платформенные типы при взаимодействии с Java-кодом.
10. Напишите функцию, которая выполняет различные действия в зависимости от того, является ли входной параметр null или нет.

### Упражнение 6: Коллекции
1. Создайте список целых чисел и продемонстрируйте различные операции со списком (добавление, удаление, поиск, фильтрация).
2. Напишите программу, которая создает карту студентов и их оценок, а затем вычисляет среднюю оценку.
3. Создайте множество уникальных элементов и продемонстрируйте операции, такие как объединение, пересечение и разность.
4. Напишите программу, которая преобразует список строк в верхний регистр, используя функцию map.
5. Создайте программу, которая фильтрует список чисел для поиска только четных чисел.
6. Напишите код, который группирует список слов по их первой букве, используя groupBy.
7. Создайте программу, которая сортирует список пользовательских объектов с помощью пользовательского компаратора.
8. Напишите код, демонстрирующий разницу между изменяемыми и неизменяемыми коллекциями.
9. Создайте программу, которая находит наиболее часто встречающийся элемент в списке.
10. Напишите код, который сглаживает список списков в один список, используя flatMap.

### Упражнение 7: Операции со строками
1. Напишите программу, которая подсчитывает вхождения подстроки в строке.
2. Создайте функцию, которая делает первую букву каждого слова в предложении заглавной.
3. Напишите код, который проверяет, является ли строка действительным палиндромом, игнорируя регистр и неалфавитно-цифровые символы.
4. Создайте программу, которая извлекает все адреса электронной почты из текста с помощью регулярных выражений.
5. Напишите функцию, которая форматирует номер телефона в стандартный формат.
6. Создайте программу, которая генерирует случайный пароль заданной длины.
7. Напишите код, который заменяет все вхождения слова в тексте на другое слово.
8. Создайте программу, которая разделяет строку с разделителями-запятыми на список строк.
9. Напишите функцию, которая проверяет, содержит ли строка только цифры.
10. Создайте программу, которая реализует простой строковый шифр для шифрования и дешифрования.

### Упражнение 8: Диапазоны и прогрессии
1. Напишите программу, которая выводит все числа в диапазоне с помощью цикла for.
2. Создайте функцию, которая проверяет, находится ли число в определенном диапазоне.
3. Напишите код, который перебирает диапазон в обратном порядке.
4. Создайте программу, которая генерирует случайное число в заданном диапазоне.
5. Напишите код, который перебирает символы от 'А' до 'Я'.
6. Создайте программу, которая использует диапазон для реализации простой игры "угадай число".
7. Напишите код, демонстрирующий разницу между включающими и исключающими диапазонами.
8. Создайте программу, которая использует шаг в диапазонах для вывода только четных или только нечетных чисел.
9. Напишите функцию, которая возвращает подмножество диапазона на основе определенных условий.
10. Создайте программу, которая использует диапазоны для реализации простого календарного приложения.

### Упражнение 9: Лямбда-выражения и функции высшего порядка
1. Напишите программу, которая использует filter, map и reduce для обработки списка чисел.
2. Создайте функцию высшего порядка, которая применяет заданную операцию ко всем элементам списка.
3. Напишите код, который сортирует список объектов, используя лямбда-выражение в качестве компаратора.
4. Создайте программу, которая использует функцию `let` для безопасной обработки nullable значений.
5. Напишите функцию, которая принимает другую функцию в качестве параметра и выполняет её несколько раз.
6. Создайте программу, которая реализует простой обработчик событий с использованием лямбд.
7. Напишите код, который использует функции `with` и `apply` для настройки объекта.
8. Создайте программу, которая использует последовательности для эффективной обработки большого списка.
9. Напишите функцию, которая возвращает другую функцию (замыкание), захватывая переменные из своей области видимости.
10. Создайте программу, которая реализует простой калькулятор с использованием функций высшего порядка.

### Упражнение 10: Расширения
1. Напишите функцию-расширение для Int, которая проверяет, является ли число простым.
2. Создайте свойство-расширение для String, которое возвращает количество гласных, содержащихся в нем.
3. Напишите функцию-расширение для List<String>, которая объединяет все элементы с указанным разделителем.
4. Создайте функцию-расширение для Date, которая форматирует его в соответствии с указанным шаблоном.
5. Напишите функцию-расширение для File, которая считывает его содержимое в виде списка строк.
6. Создайте свойство-расширение для List<Int>, которое возвращает среднее значение всех элементов.
7. Напишите функцию-расширение для String, которая проверяет, является ли она действительным адресом электронной почты.
8. Создайте функцию-расширение для Int, которая преобразует его в строку римскими цифрами.
9. Напишите функцию-расширение для List<T>, которая возвращает случайный элемент.
10. Создайте функцию-расширение для Any, которая красиво выводит его свойства и значения.

## Объектно-ориентированное программирование в Kotlin

### Упражнение 11: Классы и объекты
1. Создайте класс, представляющий Книгу, со свойствами, такими как название, автор и ISBN.
2. Напишите класс для Банковского Счета с методами для внесения и снятия средств.
3. Создайте класс Студент со свойствами для имени, идентификатора и списка курсов.
4. Напишите класс Прямоугольник с методами для вычисления площади и периметра.
5. Создайте класс Время с часами, минутами и секундами и методом для сложения двух временных промежутков.
6. Напишите класс Человек со свойствами и методом для вычисления возраста на основе даты рождения.
7. Создайте класс Счетчик с методами для увеличения, уменьшения и сброса счетчика.
8. Напишите класс Температура, который преобразует между Цельсием, Фаренгейтом и Кельвином.
9. Создайте класс Корзина для покупок, который управляет списком товаров с методами для добавления, удаления и расчета общей суммы.
10. Напишите класс Точка, представляющий двумерную точку, с методами для вычисления расстояния до другой точки.

### Упражнение 12: Конструкторы и инициализация
1. Создайте класс с несколькими конструкторами, используя синтаксис первичного и вторичного конструктора.
2. Напишите класс с блоком init, который проверяет параметры конструктора.
3. Создайте класс, демонстрирующий инициализацию свойств в конструкторе.
4. Напишите класс с компаньон-объектом, который предоставляет фабричные методы для создания экземпляров.
5. Создайте класс, который имеет обязательные и необязательные параметры в своем конструкторе.
6. Напишите класс, который вычисляет и инициализирует производные свойства во время конструирования.
7. Создайте класс с приватным конструктором, который может быть создан только с использованием фабричных методов.
8. Напишите класс, демонстрирующий ленивую инициализацию свойств.
9. Создайте класс, который принимает карту свойств в своем конструкторе и динамически устанавливает их.
10. Напишите класс, демонстрирующий порядок инициализации с несколькими блоками init и наследованием.

### Упражнение 13: Наследование и интерфейсы
1. Создайте иерархию фигур с общим интерфейсом и конкретными реализациями.
2. Напишите интерфейс для воспроизводимого элемента и реализуйте его в нескольких классах.
3. Создайте базовый класс Транспортное средство и выведите из него конкретные типы транспортных средств.
4. Напишите программу, демонстрирующую реализацию нескольких интерфейсов в одном классе.
5. Создайте абстрактный класс для финансового инструмента и реализуйте конкретные типы.
6. Напишите пример делегирования интерфейса в Kotlin.
7. Создайте иерархию классов для простой игры с персонажами, имеющими разные способности.
8. Напишите программу, демонстрирующую использование модификаторов `open` и `override`.
9. Создайте иерархию интерфейсов и класс, который реализует несколько интерфейсов.
10. Напишите программу, показывающую, как вызвать реализацию суперкласса из переопределенного метода.

### Упражнение 14: Модификаторы доступа
1. Создайте класс с private, protected и public членами и продемонстрируйте их видимость.
2. Напишите класс с internal членами и получите к ним доступ из разных модулей.
3. Создайте базовый класс с protected членами и получите к ним доступ из производного класса.
4. Напишите программу, демонстрирующую инкапсуляцию с использованием private свойств с public геттерами и сеттерами.
5. Создайте класс с private конструктором и фабричным методом.
6. Напишите класс с private функциями, которые вызываются из public методов.
7. Создайте иерархию sealed классов с различными модификаторами доступа для членов.
8. Напишите программу, демонстрирующую разницу между private и private set для свойств.
9. Создайте класс, который использует функции и свойства уровня пакета.
10. Напишите программу, показывающую, как ограничить видимость функции-расширения.

### Упражнение 15: Свойства и поля
1. Создайте класс с пользовательскими геттерами и сеттерами для свойств.
2. Напишите класс с ленивой инициализацией свойства.
3. Создайте класс с вычисляемыми свойствами, которые получаются из других свойств.
4. Напишите класс, демонстрирующий backing fields в пользовательских аксессорах.
5. Создайте класс со свойством, которое инициализируется через делегат.
6. Напишите класс с наблюдаемыми свойствами, которые уведомляют при изменении.
7. Создайте класс с const и @JvmField-аннотированными свойствами.
8. Напишите программу, демонстрирующую позднюю инициализацию свойств.
9. Создайте класс со свойствами, которые имеют значения по умолчанию.
10. Напишите класс, демонстрирующий, как переопределить свойства в производном классе.

### Упражнение 16: Методы и функции
1. Создайте класс с методами, которые используют значения параметров по умолчанию.
2. Напишите класс с перегрузкой методов.
3. Создайте класс с методами-расширениями, определенными внутри него.
4. Напишите класс с перегрузкой операторов (плюс, минус и т.д.).
5. Создайте класс с infix методами для более читаемого кода.
6. Напишите класс с методами высшего порядка, которые принимают функции в качестве параметров.
7. Создайте класс с suspend методами для использования с корутинами.
8. Напишите класс с методами, которые возвращают функциональные типы.
9. Создайте класс с рекурсивными методами.
10. Напишите класс, демонстрирующий использование inline функций.

### Упражнение 17: Data классы
1. Создайте data класс, представляющий Человека с именем, возрастом и адресом.
2. Напишите программу, которая демонстрирует копирование экземпляра data класса с измененными свойствами.
3. Создайте программу, которая сравнивает два экземпляра data класса.
4. Напишите код, который деструктурирует data класс в отдельные переменные.
5. Создайте data класс с пользовательскими реализациями equals, hashCode и toString.
6. Напишите программу, которая использует data классы с коллекциями.
7. Создайте вложенную структуру data классов (например, Человек с Адресом).
8. Напишите код, который преобразует data класс в JSON и обратно.
9. Создайте программу, которая сортирует список экземпляров data класса.
10. Напишите функцию, которая обрабатывает список data классов с использованием функциональных операций.

### Упражнение 18: Sealed классы
1. Создайте иерархию sealed классов, представляющих различные типы ответов сети.
2. Напишите выражение when, которое обрабатывает все возможные подклассы sealed класса.
3. Создайте sealed класс, представляющий различные состояния игры.
4. Напишите программу, которая использует sealed классы для моделирования конечного автомата.
5. Создайте иерархию sealed классов для представления математических выражений.
6. Напишите реализацию шаблона visitor с использованием sealed классов.
7. Создайте программу, которая использует sealed классы для обработки ошибок.
8. Напишите функцию, которая обрабатывает различные типы UI событий, представленных sealed классами.
9. Создайте sealed класс для представления различных типов сообщений в приложении чата.
10. Напишите программу, которая комбинирует sealed классы с data классами.

### Упражнение 19: Object и companion object
1. Создайте синглтон, используя синтаксис объявления object.
2. Напишите класс с companion object, который предоставляет фабричные методы.

> СКОРО
