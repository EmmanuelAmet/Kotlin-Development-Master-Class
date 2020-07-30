import kotlin.random.Random

fun main() {
    println(Random.nextInt())
    println(Random.nextInt(10))
    println(Random.nextInt(20, 30))

    println(Random.nextDouble())
    println(Random.nextDouble(44.4))
    println(Random.nextDouble(33.4, 99.0))
}