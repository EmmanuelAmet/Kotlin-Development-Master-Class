fun main() {
    //String Length
    val name = "Dictionary"
    println(name.length)

    //Upper Case
    val myName = "emmanuel"
    println("Upper Case: " + myName.capitalize())

    //Lower Case
    println("Lower Case: " + myName.decapitalize())

    //Trim
    val trim = " The existence of Dark Matter is True.  "
    println(trim.trim())

    //Char position
    var position = "Position"
    println(position.get(4))
    println(position[4])

    //Sub String
    var subString = "My Name is Emmanuel Ametepee"
    println("Sub String: " + subString.substring(3))
    println("Sub String: " + subString.substring(3, 6))

    //String Template
    val language = "Kotlin"
    println("My best language is $language")

    println("I have ${2+4} cars")

    val client = "Mary"
    val product = 3
    val price = 30
    println("$client must pay a total amount of ${product*price}")
}