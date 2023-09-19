//задача1
fun main() {
    //создаем функцию  которая принимает две строки — firstName и lastName.
    // и выводит полное имя
fun printFullName(firstName: String, lastName: String) {
    val fullName = "$firstName $lastName"
    println(fullName)
}

//задача 2
// вызываем функцию printFullName, используя именованные аргументы;
    printFullName(firstName= "Джорно", lastName  = "Джованна")

//задача 3
//напишите функцию под названием calculateFullName, которая
//возвращает полное имя в виде строки. Используйте ее для сохранения
//собственного имени в константе;

/*  fun calculateFullName(firstName: String, lastName: String): String {
    return "$firstName $lastName"
}
     val fullName = calculateFullName("Джо", "Джо")
    println(fullName)

   */

//задача 4
//меняем функцию, чтобы вернуть Pair
//содержащую как полное имя, так и длину имени
fun calculateFullName(firstName: String, lastName: String): Pair<String, Int> {
    val fullName = "$firstName $lastName"
    val fullNameLength = fullName.length
    return fullName to fullNameLength
}
// Используем, чтобы определить длину собственного полного имени;
    val (fullName, fullNameLength) = calculateFullName("Дио", "Брандо")
    println("полное имя: $fullName")
    println("длинна имени: $fullNameLength")

//задача 5
//Напишите функцию (функции) для нахождения простого числа;
    //простое число делится только на само себя и на 1.
fun isPrimeNumber(num: Int): Boolean {
    if (num <1) return false
    for (i in 2 until  num) {
        if (num % i == 0) return false
    }
    return true
}
    val number = 2
    if (isPrimeNumber(number)) {
        println("$number - является простым числом")
    } else {
        println("$number - не является простым числом")
    }

//задача 6
//Напишите функцию, которая вычисляет значение из последовательности Фибоначчи.
fun fibonacci(n: Int): Int {
    if (n <= 2) return 1
    var fib1 = 1
    var fib2 = 1
    var fibSum = 0
    for (i in 3..n) {
        fibSum = fib1 + fib2
        fib1 = fib2
        fib2 = fibSum
    }
    return fibSum
}
    val n = 17
    val fibonacciNumber = fibonacci(n)
    println("Fibonacci($n) = $fibonacciNumber")
}