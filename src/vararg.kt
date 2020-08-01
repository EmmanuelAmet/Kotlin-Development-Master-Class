fun main() {
    sayHello("Emmanuel", "Henry", "Fiona")
    println(sum(2,3,4))
}

fun sayHello(vararg names:String){
    for(name in names){
        println("Hello $name")
    }
}

fun sum(vararg number:Int): Int{
    var total = 0
    for(i in number){
        total += i
    }
    return total
}