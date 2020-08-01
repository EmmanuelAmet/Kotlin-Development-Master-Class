fun main() {
    listAnimals()
}

fun listAnimals(){
    fun listOneAnimal(animal:String){
        println("I have $animal")
    }

    val names = arrayListOf("cat", "dog")
    for(name in names){
        listOneAnimal(name)
    }
}