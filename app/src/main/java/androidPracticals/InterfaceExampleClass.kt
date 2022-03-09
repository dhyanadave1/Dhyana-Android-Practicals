package androidPracticals

interface Vehicle {
    fun start()
    fun stop()
}

class Car : Vehicle {
    override fun start() {
        println("Car started")
    }

    override fun stop() {
        println("Car stopped")
    }
}

fun main() {
    val car = Car()
    car.start()
    car.stop()
}

