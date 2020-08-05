package standard.functions

fun main() {
    val animals = listOf("cat", "dog", "mouse", "bear", "zebra")
    animals.map { it.length }
        .filter { it > 3 }
//        .let {
//            println(it)
//            println("Size of list is ${it.size}")
//        }
        .let(::println)

    val name = readLine()
    name?.let {
        println("your name is $name")
    }

    print("Enter a number: ")
    val number = readLine()
    number?.let {
        val convert = it.toInt()
        val double = convert.times(convert)
        println("The double of $number is $double")
    }

    val clients = arrayListOf<String?>()
    do {
        println("Enter client name")
        val input = readLine()
            input?.let {
                if(it.toLowerCase() == "stop"){
                    if(it == "")
                        clients.add(null)
                    else
                        clients.add(it)
                }
            }
    }while (input?.toLowerCase() != "stop")
    println("Clients: $clients")
    clients.forEach {
        it?.let {
            println("Hello $it")
        }
    }

}