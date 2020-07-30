fun main() {
    var num1 = 24
    val num2 = 43
    var result = num1 + num2
    println("Addition: $result")
    println("Subtraction: ${num1-num2}")
    println("Division: ${num1/num2}")
    println("Multiplication: ${num1*num2}")
    println("Modulo: ${num1%num2}")
    println("num1 ${++num1}")

    //Agumented Assignment
    var  bike = 5
    bike +1
    println(bike)
    bike +=3
    println(bike)
    bike *=3
    println(bike)
    bike /=3
    println(bike)
    bike %=2
    println(bike)
}