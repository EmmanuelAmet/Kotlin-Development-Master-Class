fun main() {
    var name:String? = null
    val herName:String = "Lily"
    println(name)
    println(herName)
    println(name?.length)
    name = "Eric"
    println(name.length)

    var a:Int? = 4
    a?.plus(3)
    println("plus $a")
    a?.times(4)
    println("times $a")
    a!!.div(4)
    println("div $a")
    a!!.rem(4)
    println("rem: $a")

    val myName: String? = "Emmanuel"
    println(myName!!.substring(3,5))

    println("Enter name:")
    val user:String? = readLine()
    println("The length of $user is ${user?.length}")

    println("Enter a number")
    val number = readLine()
    val numc = number?.toDouble()
    val multi = numc?.times(7)
    val toS = multi?.toString()
    println("Number Length: ${toS?.length}")


}