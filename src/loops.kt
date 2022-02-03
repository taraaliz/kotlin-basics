fun main(args: Array<String>) {
    // for loops
    val numSet = arrayOf(1, 563, 23)
    for (index in numSet.indices) {
        println(index)
    }
    for (number: Int in numSet) {
        println(number)
    }

    // while loops
    val names = arrayOf("Jeffrey", "William", "Golding", "Segun", "Bob")
    var i = 0
    while (names[i] != "Segun") {
        println("I am not Segun.")
        i++
    }
}