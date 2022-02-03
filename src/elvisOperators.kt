fun main(args: Array<String>) {
    // (expression) ?: alternatevalue
    // a null variable
    val nullName: String? = null
    // use nullName if not null, otherwise use "John"
    val firstName = nullName ?: "John"
    println(firstName)
    var name: String? = "James"
    println(name?.length)
    name = null // null value assignment permitted
    println(name?.length)
}