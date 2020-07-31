fun main() {
    val numbers = setOf(24,3423,342,242)
    println(numbers.size)
    println(numbers.stream())
    println(numbers.contains(44))
    println(numbers.isEmpty())

    val numbers2 = setOf(43,42,24,23)
    println(numbers.containsAll(numbers2))
    println(numbers.containsAll(setOf(24,342)))
}