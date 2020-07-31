fun main() {
    println("Enter Something:")
     val test = readLine()
    try {
        println(test?.toInt())
    }catch (e: Exception){
        println("Oops, Exception Occurred.\n ${e.localizedMessage}")
        println(e.printStackTrace())
    }

    try {
        println("Please enter a number:")
        val input = readLine()
        val convert = input?.toInt()
        val product = convert?.times(5)
        println("The product is $product")
    }catch (e:Exception){
        println("oops, an exception has occurred.")
    }finally {
        println("Execution completed.")
    }
}