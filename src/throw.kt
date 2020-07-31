import java.lang.IllegalStateException

fun main() {
    val test = readLine()
    throw IllegalStateException("This is an illegal state.")
}