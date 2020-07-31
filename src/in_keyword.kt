fun main() {
    val favouritePet = "dog"
    val availablePets = listOf("dog", "cat", "horse")
    if(favouritePet in availablePets){
        println("We have your next best pet")
    }else{
        println("Sorry, $favouritePet is not available")
    }

    if(favouritePet !in availablePets){
        println("Not available")
    }else{
        println("Sorry, $favouritePet " +
                "available")
    }
}