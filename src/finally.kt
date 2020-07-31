fun main() {
    val test = readLine()
    try {
        println(test?.toInt())
    }catch (e: Exception){
        println("An exception has occurred\n ${e.localizedMessage}")
        println(e.printStackTrace())
    }finally {
        println("Execution has completed")

    }
}