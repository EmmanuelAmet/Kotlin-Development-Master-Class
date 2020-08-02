package OOP

fun main() {
    val myCar:Car2 = Car2()
    val yourCar = Car2()

    myCar.model = "BMW"
    yourCar.model = "Toyota"

    myCar.start()
    myCar.drive(54)

    yourCar.start()
    yourCar.drive(55)

    val animal = Animal()
    animal.run()
    animal.topSpeed = 55
    animal.run()

    val math = Math()
    val m1 = math.Add(3.6,5.4)
    println("Addition: $m1")
}

class Math{
    fun Add(num1:Double, num2:Double):Double{
        return num1+num2
    }

    fun Sub(num1:Double, num2:Double):Double{
        return num1-num2
    }

    fun Mul(num1:Double, num2:Double):Double{
        return num1/num2
    }

    fun Div(num1:Double, num2:Double):Double{
        return num1*num2
    }

}
class Animal{
    var topSpeed = 0

    fun run(){
        println("Animal Speed is $topSpeed")
    }
}

class Car2{
    var model:String? = null
    val topSpeed = 100

    fun start(){
        println("Starting the $model")
    }

    fun drive(speed:Int){
        println("Driving at a speed of $speed")
    }
}