fun digitCount(n: Int): Int {
    var count = 0
    var x = n
    while (x > 0) {
        count++
        x /= 10
    }
    return count
}

fun digitSum(n: Int): Int {
    var sum = 0
    var x = n
    while (x > 0) {
        sum += x % 10
        x /= 10
    }
    return sum
}

fun power(base: Int, exp: Int): Long {
    var result = 1L
    repeat(exp) { result *= base }
    return result
}

fun isArmstrong(number: Int): Boolean {
    val n = digitCount(number)
    return power(digitSum(number), n) == number.toLong()
}

fun findArmstrong(k: Int): List<Int> {
    val result = mutableListOf<Int>()
    for (i in 1..k) {
        if (isArmstrong(i)) result.add(i)
    }
    return result
}

fun main() {
    print("Введите k: ")
    val k = readln().toInt()

    val numbers = findArmstrong(k)
    println("Числа Армстронга от 1 до $k: ${numbers.joinToString(", ")}")
}
