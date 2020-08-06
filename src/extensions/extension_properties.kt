package extensions
/*
Note:
    1. you can add properties to classes, in a similar way to fun
    2. They cannot be local, i.e declared inside a fun or class
    3. Cannot updatean extension property
    4. can only use values (val) not variables (var)
 */
fun main() {
    val name = "Emmanuel"
    println(name.betterLength)
}
val String.betterLength:Int
get() = 200