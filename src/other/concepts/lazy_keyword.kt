package other.concepts

import kotlin.random.Random

fun main() {
    val someLargeVariable: String by lazy { "Some large value" }
    if(Random.nextInt() % 2 == 0){
        println(someLargeVariable)
    }

    val newUser by lazy { NewUser() }
    val band = listOf("Anna", "Vida", "Marly", "Emma", "")
    println("Please enter username")
    val input1 = readLine()?:""
    if(!band.contains(input1))
        newUser.printWelcome()

    val list by lazy { generateList() }
    println("Should the list be generate? (yes/no)")
    val input = readLine()?:""
    if(input == "yes"){
        println(list)
    }

}
fun generateList(): List<Int>{
    val integer = arrayListOf<Int>()
    for(i in 1..1000)
        integer.add(Random.nextInt(1000))
    return integer
}

class NewUser{
    fun printWelcome(){
        println("Hello to the course")
    }
}