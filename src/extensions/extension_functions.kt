package extensions

fun main() {
    val name = "Emmanuel"
    println(name.slim())
    println("Grace".getCustomName())
    println(3.getCustomName())
    println(2.5F.getCustomName())
}

fun String.slim() :String{
     return this.substring(1, length-1)
}

fun String.getCustomName() = "A string of characters"
fun Int.getCustomName() = "An integer Number"
fun Float.getCustomName() = "A floating point Number"