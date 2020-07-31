fun main() {
    println("Enter Something:")
     val test = readLine()
    try {
        println(test?.toInt())
    }catch (e: Exception){
        println("Oops, Exception Occurred.\n ${e.localizedMessage}")
        println(e.printStackTrace())
    }
}