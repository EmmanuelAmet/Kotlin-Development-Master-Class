package oopprinciples

fun main() {
    val carol = Daughter("English")
    println(carol.hairColor)
    carol.say("Hello")

    val bird = Bird()
    bird.fly()
}

open class Bird{
    open var color = "Brown"
    open var speed = 23
    open fun fly(){
        println("The speed of the bird is $speed and has $color color.")
    }
}
class Parakeet:Bird(){
    override var color = "Green"
    override var speed = 454
    override fun fly() {
        super.fly()
        println("A ${super.color} colored with a speed of ${super.speed}")
    }
}
open class Mom(native:String){
    open val hairColor = "Brown"
    open val eyeColor = "blue"
    open fun say(message:String){
        println("mom say $message")
    }
}

class Daughter(native: String): Mom(native){
    override val hairColor = "Blonde"
    override fun say(message: String){
        println("Daughter say Hi")
        super.say(message)
        println("Mother has ${super.hairColor} hair color")
    }
}