fun main() {
    val numbers = hashSetOf(3,4,null,83,56)
    println(numbers.size)
    val numbers2 = hashSetOf(3,4,5,67)
    println(numbers.retainAll(numbers2))
    numbers.retainAll(numbers2)
    println(numbers)
    numbers.clear()
    println(numbers.isEmpty())
}