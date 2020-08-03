package oop

fun main() {

}
class Car{
    var model:String? = null
    val topSpeed = 100

    fun start(){
        println("Starting the $model")
    }

    fun drive(speed:Int){
        println("Driving at a speed of $speed")
    }
}