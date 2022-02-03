fun returnFullName(firstName: String, surname: String): String {
    return ("$firstName $surname")
}

fun main(args: Array<String>) {
    val fullName: String = returnFullName("Tara", "Flavin")
    println(fullName)
}