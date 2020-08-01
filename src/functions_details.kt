fun main() {

    val first = multiply(3)
    println("First function: $first")
    val second = multiply(3,4)
    println("Second function: $second")

    animal("Dog")


}

fun multiply(number:Int) = number*2
fun multiply(num:Int, num2:Int) = num*num2

fun animal(name:String){
    println("Please enter animal name")
    val input = readLine()
    println("you enter $name as an animal")
}

fun animal(list: Collection<String>){
    for(name in list){
        println("Here are your animals: $name")
    }
}