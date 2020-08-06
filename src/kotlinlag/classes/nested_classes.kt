package kotlinlag.classes

fun main() {
    val car = Car()
    car.drive()
}
class Car{
    private val engine = Engine()
    var speed = 84
    fun drive(){
        engine.run()
        println("Driving at $speed")
    }

    inner class Engine{
        var prm = 3000
        fun run(){
            println("Engine is running at $prm")
            this@Car.speed = 434
            //this@Car.drive()
        }
    }
}