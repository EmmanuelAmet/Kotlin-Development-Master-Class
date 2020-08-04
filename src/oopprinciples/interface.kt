package oopprinciples

fun main() {
    val myOven:Oven = getOven()
    myOven.turnOn()
    myOven.cook(45)
    myOven.turnOff()

    val rest1:Restaurant = LocalRestaurant()
    rest1.provideBill()
    rest1.provideFood()
    val rest2:Restaurant = FancyFood()
    rest2.provideFood()
    rest2.provideBill()

    val child = Child()
    child.raisePet()
}
interface Pet{
    var cutenessLevel:Int
    fun startPlaying()
    fun feed()
}
class Puppy:Pet{
    override var cutenessLevel: Int = 100
    override fun startPlaying() {
        println("Running, barking and jumping")
    }

    override fun feed() {
        println("Give doggy treat")
    }
}
class Child{
    var pet:Pet
    init {
        val petStore = PetStore()
        pet = petStore.getPet()
    }
    fun raisePet(){
        for(i in 1..pet.cutenessLevel){
            pet.startPlaying()
        }
        pet.feed()
    }
}
class PetStore{
    fun getPet():Pet{
        return Puppy()
    }
}
class LocalRestaurant:Restaurant{
    override fun provideFood() {
        println("your local restaurant provide food.")
    }

    override fun provideBill() {
        println("please pay 25$")
    }

}
class FancyFood:Restaurant{
    override fun provideFood() {
        println("This food is delicious.")
    }

    override fun provideBill() {
        println("please pay 66$")
    }

}

interface Restaurant{
    fun provideFood()
    fun provideBill()
}
fun getOven():Oven{
    return Boash()
}
class Boash:Oven{
    override val temperaure: Int
        get() = 33

    override fun turnOn() {
        println("Turning on")
    }

    override fun turnOff() {
        println("Turning off")
    }

}

interface Oven{
    val temperaure:Int
    fun turnOn()
    fun turnOff()
    fun cook(temp:Int){
        println("Cooking at $temp at degrees")
    }
}