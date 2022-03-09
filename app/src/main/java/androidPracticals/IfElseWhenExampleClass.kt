package androidPracticals

const val myName: String = "Dhyana"
var greetings: String? = null

fun main() {
    var greeting: String? = null
    greeting?.let {
        println("Hello world")
    }
    println("Hii all")

    when (greetings) {
        null -> println(myName)
        else -> print(greetings)
    }
}