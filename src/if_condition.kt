fun main() {
    println("Enter a boolean value")
    val input = readLine()?:"true"
    val night = input.toBoolean()
    if(night){
        println("Sleep")
    }else{
        println("Active")
    }

    println("Please enter the input for the funds:")
    var inp = readLine()?:""
    var clientFunds = inp.toInt()
    var price = 50
    var clientProduct = 0
    if(clientFunds > price){
        clientFunds -= price
        clientProduct += 1
        println("You have perchased $clientFunds amount")
        println("You have perchased $clientProduct product")
    }else{
        println("You have insufficient funds.")
    }

    val petStore = listOf("cat", "dog", "rabbit")
    val hasCatFood = true
    if(petStore.contains("cat")){
        if(hasCatFood){
            println("Buy at and cat food")
        }else{
            println("Buy cat")
        }
    }else{
        println("Ask pet store to get cat.")
    }

    var isEven:String? = null
    val number = 30
    if(number % 2 == 0) isEven = "Number is even"  else isEven = "Number is odd"

    val result = 50
    var grade:Char? = 'A'
    if(result >= 50){
        grade = 'C'
        println(grade)
    }else if(result >= 70){
        grade = 'B'
        println(grade)
    }else{
        println("Failed")
    }
}