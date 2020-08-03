package oop

fun main() {
    //val animals = listOf("Cat", "Dog", "Horse")
    val animal:ArrayList<String> = arrayListOf()
    val table = Table()
    println(table.color)
    val myGarage = Garage()
    myGarage.car
}

class Table{
    var color = "white"
}

class MyCar{
    fun drive(){
        println("Driving along in my car")
    }
}

class Garage{
    val car = MyCar()
}