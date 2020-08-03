package oopprinciples

fun main() {

}
open class AirPlane{
    internal var type = "Airbus"
    internal fun fly(){
        println("flying")
    }
}
class MyAirplane:AirPlane(){
    fun takeOff(){
        println(type)
        fly()
    }
}
class MyCar{
    fun start(){
        val airplane = AirPlane()
        println(airplane.type)
        airplane.fly()
    }
}