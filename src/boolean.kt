fun main() {
    val animals = arrayListOf<String>()
    if(animals.isEmpty()){
        val input = readLine()
        animals.add(input.toString())
        println("Animals $animals")
    }else{
        println("Not empty")
    }

    val ani = arrayListOf("dog")
    if(ani.add("horse")){
        println("Data inserted successfully")
    }else{
        println("Oops something went wrong.")
    }

    val list = listOf("Emmanuel", "Nathan", "Emrys", "Grace", "Juliet")
    println("please enter your name:")
    val name = readLine()?:""
    if(name in list){
        println("Access Granted")
    }else{
        println("Access Denied, please try again")
    }
}