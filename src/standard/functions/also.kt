package standard.functions

fun main() {
    Car().apply {
        speed = 42
        drive()
    }.also {
        println("Car is Running")
    }
}
