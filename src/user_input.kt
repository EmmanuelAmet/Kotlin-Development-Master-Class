fun main() {
    println("Enter your firstname")
    val firstname = readLine()
    println("Enter Firstname: $firstname")

    //Number input
    val user = readLine()?:""
    println("You wrote: ${user.toInt()*5}")

}