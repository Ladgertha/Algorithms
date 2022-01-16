fun main() {
    val input = intArrayOf(1, 2, 678, 0, -2, 1, -5, 23, 17, 3)
    println(quickSort(input, 0, input.size - 1).contentToString())
}

fun quickSort(array: IntArray, start: Int, end: Int): IntArray {
    // не делаем сортировку, если в массиве 1 элемент или если уже обе части отсортированы
    if (start >= end || array.size < 2) {
        // массив уже отсортирован
        return array
    }
    // находим опорный элемент
    val pivot = partition(array, start, end)
    // сортируем левую часть массива (от первого элемента до опорного)
    quickSort(array, start, pivot - 1)
    // сортируем правую часть массива (от опорного + 1 до последнего)
    quickSort(array, pivot + 1, end)
    // возвращаем отсортированный массив
    return array
}

fun partition(array: IntArray, start: Int, end: Int): Int {
    var marker = start // начинаем с первого элемента
    for (i in start..end) { // перебираем каждый элемент в переданном массиве
        if (array[i] <= array[end]) { // если текущий проверяемый элемент меньше последнего
            val temp = array[marker] // меняем местами
            array[marker] = array[i]
            array[i] = temp
            marker += 1
        }
    }
    return marker - 1
}