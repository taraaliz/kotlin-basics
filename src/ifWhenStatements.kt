fun ifStatement(a: Int) {
    if (a == 1) {
        print ("a is equal to one.")
    } else if (a == 2) {
        print ("a is equal to two.")
    } else {
        print ("a is neither one nor two.")
    }
}

fun printEvenNumbers (numbers: Array<Int>) {
    numbers.forEach {
        when (it % 2) {
            0 -> println(it)
        }
    }
}
fun main(args: Array<String>) {
    ifStatement(4)
    val numberList: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6)
    printEvenNumbers(numberList)
}
