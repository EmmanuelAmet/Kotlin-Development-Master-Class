package oop

fun main() {
    val myCar = Car3("BMW", 3456)
    val herCar = Car4()
    val vCar = Car4("BN")
    val bCar = Car4("ASW", 24)

    val table1 = Table2()
    val table2 = Table2(1)
    val table3 = Table2(3,5)
    table1.printInfo()
    table2.printInfo()
    table3.printInfo()
}

class Table2{
    var legs = 4
    var height = 45
    constructor(){
        legs = 3
        height = 23
    }
    constructor(l1:Int){
        legs = l1
        height = 123
    }
    constructor(h2:Int, l2:Int){
        legs = h2
        height = h2
    }
    fun printInfo() {
        println("The table has $legs legs and a height of $height")
    }
}
class Car3(var model:String, var topSpeed:Int){

}

class Car4{
    var model:String? = null
    var topSpeed:Int? = null

    constructor(){
        model = "No model"
        topSpeed = 34
    }
    constructor(newCar:String){
        model = "New Model"
        topSpeed = 231
    }
    constructor(newModel:String, newTopSpeed:Int){
        model = newModel
        topSpeed = newTopSpeed
    }
}