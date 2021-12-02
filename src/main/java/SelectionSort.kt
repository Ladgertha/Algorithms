/**
 * Сортировка выбором. Сложность O(n^2)
 *
 * @author Anna
 */

fun main() {
    val input = intArrayOf(1, 2, 678, 0, -2, 1, -5, 17, 23, 1500)
    println(selectionSort(input).contentToString())
}

fun selectionSort(array: IntArray): IntArray {
    if (array.isEmpty() || array.size == 1) return array // Не сортируем и ничего не создаем, если массив пустой

    var biggestIndex = 0 // Здесь храним индекс самого большего элемента среди НЕ отсортированных
    var lastBiggest: Int // Самый большой элемент среди НЕ отсортированных
    var temp: Int // Тут будем хранить временный элемент при перестановке

    for (index in array.indices) { // В цикле проходим по каждому элементу
        lastBiggest = array[index] // Ставим текущий элемент самым большим

        for (subIndex in index until array.size) { // В цикле пробегаем по НЕ отсортированным элементам
            if (array[subIndex] >= lastBiggest) { // Если текущий проверяемый элемент больше самого большого
                lastBiggest = array[subIndex] // Делаем самым большим текущий элемент
                biggestIndex = subIndex // И запоминаем индекс. Он нам пригодится
            }
        }

        temp = array[index] // Кладем во временный элемент текущий
        array[index] = lastBiggest // Меняем текущий на самый большой, который нашли
        array[biggestIndex] = temp // На место, где стоял самый большой, кладем текущий элемент
    }
    return array // возвращаем тот же массив, но уже отсортированный
}
