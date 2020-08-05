package standard.functions

fun main() {
    val myCar = MyCar().apply {
        speed = 50
        color = "red"
        startCar()
    }
}
class MyCar{
    var speed = 10
    var color = "blue"
    fun startCar(){
        println("Starting $color with speed $speed")
    }
}