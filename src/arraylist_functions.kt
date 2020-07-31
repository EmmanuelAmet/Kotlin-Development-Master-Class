fun main() {
    val colors = arrayListOf("blue", "red", "blue", "green")
    colors.set(1, "redder")
    println(colors)
    val subColor = colors.subList(1,3)
    println(subColor)
    println(subColor::class.java)
    colors.clear()
    println(colors)
    println(colors.isEmpty())
    println(colors.stream())
}