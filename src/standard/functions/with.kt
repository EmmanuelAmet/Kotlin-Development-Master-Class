package standard.functions

fun main() {
    with(Car()){
        speed = 80
        drive()
        println("Car is driving...")
    }

    with(Person()){
        firstName = "Emmanuel"
        lastName = "Scofild"
        age = 20
        info()
    }
}
class Car{
    var speed = 50
    fun drive(){
        println("Driving $speed")
    }
}
class Person{
    var firstName:String? = null
    var lastName:String? = null
    var age:Int? = null
    fun info(){
        println("Your first name: $firstName, last name: $lastName and age: $age years old.")
    }
}