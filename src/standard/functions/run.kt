package standard.functions

fun main() {
    val newCar = NewCar().run {
        speed = 50
        drive()
        println("NewCar driving")
        this
    }
    println(newCar)
    run {
        val newCar2 = NewCar()
        newCar2.speed = 24
        newCar2.drive()
    }
}

class NewCar{
    var speed = 10
    fun drive(){
        println("Car is driving at $speed")
    }
}