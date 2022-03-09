package androidPracticals

fun getGreeting(): String {
    return ("Hello Kotlin")
}

fun sayHello(): String {
    return (getGreeting())
}

fun main() {
    println(sayHello())
    println(getGreeting())
    println("Hello world")
}