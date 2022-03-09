package androidPracticals

const val name: String = "Dhyana"
var greeting: String = "Hello"
val colors: String? = null

fun main() {
    println(name)
    println(greeting)

    val greeting: String = "HII"
    println(greeting)

    println(colors)
    print(colors?.length)
}
