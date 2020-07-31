fun main() {
    /*
    List
     */
    val color = listOf("blue", "red", "yellow")
    println(color.toString())
    val color2 = listOf<String>()
    println(color2)
    val color3 = listOf("black", "grey", "Ash", null)
    println(color3)
    println("Color3: ${color3[3]}")
    println("Color3: ${color3?.get(2)}")
    println("Color3 Size: ${color3.size}")

    /*
    Array List/ Mutable List
     */
    val names = arrayListOf("Emmanuel", "Henry", "Fiona", "Mike", "Nathan", "Stephan")
    println(names)
    names.add("Gate")
    println(names)
    println("Array ${names.size}")

    val animals = arrayListOf("Cat", "Goat")
    names.addAll(animals)
    println(names)
    names.remove("Mike")
    println(names)
    names.removeAll(animals)
    println(names)
    names.removeAt(3)
    println(names)
}