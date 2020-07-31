fun main() {
   //Maps
    //Classical example of map is Dictionary
    val count = mapOf(Pair(1, "One"), Pair(2, "Two"), Pair(3, "Three"))
    println(count)

    val count2 = mapOf<Int,String>()
    println(count2)

    println(count.get(2))
    println(count[1])
    println(count.keys)
    println(count.values)

    //HashMaps
    println("HashMap")
    val count3 = hashMapOf(Pair(1, "One"), Pair(2,"Two"), Pair(3,"Three"))
    count3.put(4, "Four")
    println(count3)

    val count4 = hashMapOf(Pair(20, "Twenty"), Pair(21, "Two-One"))
    count3.putAll(count4)
    println(count3)
    count3.remove(21)
    println(count3)
    count3.clear()
    println(count3)
}