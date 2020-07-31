fun main() {
    println("Enter a number")
    val input = readLine()?:"0"
    val number = input.toInt()
    if(number !in 0..9){
        println("Your number is not a single digit")
    }
}