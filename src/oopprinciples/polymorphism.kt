package oopprinciples

fun main() {
    /*
    Types of polymorphism
        -Dynamic->method overriding
        -Static->method overloading
     */
    val mom = MyMom()
    val daughter = MyDaughter()
    mom.say("hi")
    daughter.say("hi")
    mom.say(4)
    mom.say("Hello",564)
}

open class MyMom{
    open fun say(message:String){
        println("Mom says $message")
    }
    fun say(times: Int){
        for(i in 1..times){
            println("Mom says hello")
        }
    }
    fun say(message: String, times:Int){
        for(i in 1..times){
            println("mom says $times")
        }
    }
}
class MyDaughter:MyMom(){
    override fun say(message: String){
        println("Daughter says $message")
    }
}