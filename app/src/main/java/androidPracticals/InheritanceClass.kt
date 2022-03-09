package androidPracticals

open class BaseClass {
    val name = "Dhyana"
    fun printFunction() {
        println("Base Class")
    }
}

class DerivedClass: BaseClass() {
    fun printValue() {
        println(name)           //inherit name property
        println("Derived class")
    }

fun main(args: Array<String>) {
    val derivedValue = DerivedClass()
    derivedValue.printFunction()
    derivedValue.printValue()
    }
}