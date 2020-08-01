fun main() {
    val animals = arrayListOf("cat", "dog", "mouse", "bear")
    for (animal in animals){
        println("Feed the $animal")
    }

    for(i in 1..12){
        val month = when(i){
            1 -> "January"
            2 -> "February"
            3 -> "March"
            4 -> "April"
            5 -> "May"
            6 -> "June"
            7 -> "July"
            8 -> "August"
            9 -> "September"
            10 -> "October"
            11 -> "November"
            else -> "December"
        }
        println("Month #$i is called ${month}")
    }

    for(i in 1..10){
        println("$i Greetings")
    }

    var total = 0
    for(i in 1..100){
        total +=i
    }
    println(total)

    val customer = hashMapOf(Pair("Alice", 4), Pair("Judy", 8), Pair("Anna", 6))
    for(cust in customer.keys){
        val perchases = customer[cust]
        println("$cust you perchase $perchases")
    }

    for(i in 10 downTo 3 step 2){
        println("Strike #$i")
    }

    for(i in 1..5){
        for(j in 5 downTo 1){
            print("$i, $j \t")
        }
        println()
    }

    for(i in 1..5){
        for(j in 5 downTo 1){
            if(i == j){
                print("Emmanuel \t")
            }else {
                print("$i, $j \t")
            }
        }
        println()
    }
}