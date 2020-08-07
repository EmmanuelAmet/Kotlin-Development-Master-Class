package other.concepts

fun main() {
    val value = "Testing my Strings"
    if(value is String)
        println("This string has ${value.length} characters")

    val myCar:Car = getCar()
    if(myCar !is BMW){
        println("This is not favourite car.")
    }
    if(myCar is BMW){
        (myCar as BMW).drive()
    }

    val bmwCar = myCar as? BMW
    bmwCar?.drive()
}
open class Car{}
class BMW:Car(){
    fun drive(){
        println("Driving my BMW.")
    }
}
fun getCar(): Car = Car()