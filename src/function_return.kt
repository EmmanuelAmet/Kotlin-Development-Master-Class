fun main() {
    val area = calculateAreaCircle(4)
    println(area)
    val greet = greeting("B")
    println(greet)
    println("Add ${add(3,4)}")
}

fun calculateAreaCircle(radius:Int): Double{
    val pi = 3.1415
    return radius*radius * pi
}

fun add(num1:Int, num2:Int) = num1 + num2
fun greeting(person:String):String{
    val greeting = when(person[0]){
        'A' -> "Are you okay, $person"
        'B' -> "Are you okay, $person"
        else -> "Hi $person"
    }
    return greeting
}