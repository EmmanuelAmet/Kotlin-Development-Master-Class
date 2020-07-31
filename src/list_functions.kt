fun main() {
    val colors = listOf("blue", "red", "blue", "green")
    println("Size: ${colors.size}")
    println("Contains red: ${colors.contains("red")}")

    val new_colors = listOf("red", "green")
    println(colors.containsAll(new_colors))

    println("Index 1: ${colors[2]}")
    println("Last index: ${colors.lastIndexOf("blue")}")
}