package generics

fun main() {
    val box = Box<String>()
    box.display("Content")

    val carBox = Box<Car>()
    carBox.display(Car())

    val newBox = NewBox<String, Int>()
    newBox.display("Hello", 34)
}
class Box<T>{
    fun display(item: T){
        println(item)
    }
}
class NewBox<T,U>{
    fun display(item: T, item2: U){
        println(item)
        println(item2)
    }
}
class Car{

}