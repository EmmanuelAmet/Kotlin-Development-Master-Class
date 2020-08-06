package extensions

fun main() {
    val name = "Emmanuel"
    println(name.slim())
}

fun String.slim() :String{
     return this.substring(1, length-1)
}