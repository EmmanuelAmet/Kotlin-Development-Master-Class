fun main() {
    val price = 34.7
    val items = 3
    val totalPrice = price*items
    println("Total Price: $totalPrice")
    println("Number type: ${totalPrice::class.java }")

    println("Enter a number:")
    var number = readLine()?:""
    var d = 5.5
    var m = number.toInt()*d
    println("Number: ${m}")
    println("Type: ${m::class.java}")
}