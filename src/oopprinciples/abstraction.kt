package oopprinciples

fun main() {
    val container: Container = Bottle()
    container.pour()
}

abstract class Container{
    abstract fun pour()
}
class Bottle:Container(){
    fun fill(){
        println("Filling Bottle")
    }

    override fun pour() {
        println("Pouring from the bottle")
    }
}
class Jug:Container(){
    override fun pour() {
        println("Pouring from Jug")
    }

}