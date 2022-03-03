package androidPracticals

fun main(args: Array<String>) {
  val name: String? = null
    name?.let {
        println("name of string is ${name?.length}")
    }
}