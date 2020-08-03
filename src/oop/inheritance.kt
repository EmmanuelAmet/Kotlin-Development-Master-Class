package oop

fun main() {
    val myDoggy = Corgi()
    myDoggy.size = 35
    println("Size: ${myDoggy.size}")
    myDoggy.play()
    myDoggy.bark()

    val mylaptop = Laptop()
    val myApple = Apple()
    myApple.screenSize = 12
    myApple.run()
    mylaptop.run()
}

open class Laptop{
    var screenSize = 15
    var speed = 12003
    fun run(){
        println("Running laptop screen size $screenSize and speed $speed")
    }
}

class Apple:Laptop(){}

open class Dog{
    var size = 0
    fun bark(){
        println("Bark")
    }
    fun play(){
        println("Play")
    }
}

class Corgi: Dog(){

}