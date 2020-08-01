fun main() {
    for(i in 1..10){
        name()
        alphabets()
    }

    for(i in 1..3){
        multiply()
    }

    for(i in 1..3){
        myName()
    }
}

fun myName(){
    println("Please enter your name:")
    val name = readLine()
    println("Please enter your year of birth")
    val year = readLine()
    println("$name your year of birth is ${year?.toInt()}")
}
fun multiply(){
    println("Enter a number")
    val input = readLine()?:"0"
    val convert = input.toInt()
    val result = convert?.times(17)
    println("The product of $input is $result")
}
fun name(){
    println("Hello")
}

fun alphabets(){
    println("a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z")
}