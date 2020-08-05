package standard.functions

import kotlin.random.Random

fun main() {
    for(i in 1..10){
        val number = Random.nextInt(100)
        val evenOrNull = number.takeIf {
            it % 2 == 0
        }
        println("The number is $number and even is $evenOrNull")
    }

    for (i in 1..10){
        val num = Random.nextInt(100)
        val oddOrNull = num.takeUnless {
            it % 2 == 1
        }
        println("The number is $num and even is $oddOrNull")

    }

}