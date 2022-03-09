package androidPracticals

enum class Days {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}
fun main() {
    for (day in Days.values()) {
        println("${day.ordinal} = ${day.name}")
    }
}


