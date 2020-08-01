fun main() {
    //Break
    var onlyEvenNumbers = arrayListOf(2,4,6,8,7, 10)
    for(number in onlyEvenNumbers){
        if(number % 2 != 0)
            break
        println("Half of $number is ${number/2}")
    }

    val even = arrayListOf(2,4,8,7,10,2432,24)
    for(number in even){
        if(number %2 != 0)
            continue
        println("The half of $number is ${number/2}")
    }
}