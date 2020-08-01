fun main() {
   double(4)
    val people = listOf("Emmanuel", "Beatrice", "Eva")
    sayHello(people)

    dd(10, "Ten")
}

fun dd(number: Int, message:String){
    println("$message $number")
}
fun double(number:Int){
    println("Double $number is ${number*2}")
}

fun sayHello(people: Collection<String>){
    for(person in people){
        println("Hello $person")
    }
}