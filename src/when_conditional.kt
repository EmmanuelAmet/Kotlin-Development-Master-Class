fun main() {
    val action:String
    val animal = "cat"
    when(animal){
        "cat" -> {action = "Pet it"}
        "dog" -> {action = "Feed it"}
        else -> {action = "Google it"}
    }
    println("When you meet a $animal you should $action")

    val animals = "cat"
    var actions = when(animals){
        "cat" -> "feed it"
        "dog" -> "pet it"
        else -> "google it"
    }
    println("When you meet $animals $actions")

    val month = "January"
    val days = when(month){
        "January", "March", "May" -> 31
        "February" -> 28
        else -> 30
    }
    println("The month of $month has $days days")

    val name = "Emmanuel"
    when(val length = name.length){
        in 1..5 -> println("A name with $length characters")
        in 6..10 -> println("A name with $length characters")
    }
}