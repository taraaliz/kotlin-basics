fun main(args: Array<String>) {
    println("Hello World!")
    // syntax for defining variables
    var x: Int = 1
    // syntax for defining constants
    val y = 11

    // for loop that prints each character of a sentence
    var c: Char
    val sentence: String = "I am an array of characters"
    for (character in sentence) {
        c = character
        println(c)
    }

    // syntax for defining arrays
    val names = arrayOf("Toby", "Tara", "Tim")
    println(names[0]) // prints Toby
    println(names.get(1)) // prints Tara
    names[0] = "Tina" // how to change value at set position
    println(names[0])
    println(names.size) // how to print length of array
}
// example function with return type Unit that prints sum of two input variables
fun printSum(a: Int, b: Int) {
    print(a + b)
}