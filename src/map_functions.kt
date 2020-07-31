fun main() {
    val count = mapOf(Pair(1, "One"), Pair(2, "Two"), Pair(3, "Three"))
    println("Size ${count.size}")
    println("Contains ${count.containsKey(2)}")
    println("contain Value: ${count.containsValue("Th")}")
    println("contain Value say One: ${count.containsValue("One")}")
    println(count.isEmpty())
    println(count.isNotEmpty())
}