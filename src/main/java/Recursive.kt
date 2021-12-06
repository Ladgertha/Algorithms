/**
 * Задачи с рекурсией
 *
 * @author Anna
 */

fun main() {
    val input = intArrayOf(1, 2, 3, -2, -3, 16)
    println(sum(input))
    println(count(input))
    println(max(input))
}

// Посчитать сумму в массиве
fun sum(array: IntArray): Int {
    if (array.isEmpty()) return 0
    return array.first() + sum(array.copyOfRange(1, array.size))
}

// Найти количество элементов в массиве
fun count(array: IntArray): Int {
    if (array.isEmpty()) return 0
    return 1 + count(array.copyOfRange(1, array.size))
}

// Найти наибольшее число в массиве
fun max(array: IntArray): Int {
    return if (array.size == 2) {
        if (array.first() >= array.last()) array.first() else array.last()
    } else {
        max(array.copyOfRange(1, array.size))
    }
}