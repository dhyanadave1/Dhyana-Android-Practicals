package androidPracticals
import java.util.Scanner

fun main (args: Array<String>) {
    val reader = Scanner(System.`in`)
    print("Enter a number: ")
    val number = reader.nextInt()
    if (number % 2 == 0) {
        println("$number is even")
    } else
        println("$number is odd")
}