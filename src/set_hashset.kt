fun main() {
    //Set
    val numbers = setOf(6,37,6,42)
    println(numbers)
    val numbers2 = setOf<Int>()
    println(numbers2)
    val numbers3 = setOf<Int?>(4,5,2,5,null, null, 2)
    println(numbers3)

    //HashSet OR Mutable Sets
    val id = hashSetOf(232,343,234, null)
    val id2 = hashSetOf<Int>()
    println(id)
    println(id2)
    id.add(343)
    println(id)

    val id3 = hashSetOf(34,7,8,0)
    id.addAll(id3)
    println(id)
    id.remove(7)
    println(id)
    id.removeAll(id3)
    println(id.stream())
}