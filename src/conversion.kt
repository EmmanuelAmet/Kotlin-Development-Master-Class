fun main() {
    val cats = 3
    val longCats = cats.toLong()
    println(cats::class.java)
    println(longCats::class.java)

    val people = 700000000000
    val to = people.toInt()
    println(to::class.java)
}