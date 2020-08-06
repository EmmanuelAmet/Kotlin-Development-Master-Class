package kotlinlag.classes

fun main() {
    val somePlant:Plant = getPlant()
    when(somePlant){
        is Fruits -> println("Sweet Fruit")
        is Vegetable -> println("Testy Vegetable")
    }
}
fun getPlant(): Plant = Apple()
abstract class Plant

sealed class Fruits:Plant()
sealed class Vegetable:Plant()

class Apple:Fruits()
class Potato:Vegetable()
