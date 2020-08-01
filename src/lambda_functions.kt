fun main() {

    val names = arrayListOf("Alice", "Henry", "Fiona")
    val mylambda = {name:String -> println("Hello $name")}
    sayHello(names, mylambda)

    val clients = listOf("Anna", "Bob", "Eric")
    clients.forEach { println("Hello Client $it") }

    val animals = listOf("dog", "cat", "goat")
    animals.filter { it.length < 2}
        .forEach { println("Animals: $it") }

    val animals2 = listOf("dog", "cat", "goat")
    val an = animals2.map { it.length < 2}
    println(an)

    val animals3 = listOf("dog", "cat", "goat")
    val sort = animals.sortedBy { it.length }
        println(sort)

    val animals4 = listOf("dog", "cat", "goat")
    val max = animals4.maxBy { it.length}
    println(max)

    val animals5 = listOf("dog", "cat", "goat")
    val min = animals5.minBy { it.length}
    println(min)
}
fun sayHello(names: ArrayList<String>, dosomething: (String) -> Unit){
    for (name in names){
        dosomething(name)
    }
}