package oop

fun main() {
    var theCar = TheCar()
    val os = OS("Kali")
    val webBrowser = WebBrowser()

}

class WebBrowser{
    init {
        println("Web browser is connecting...")
        println("loading http://www.google.com/")
    }
}

class OS(operatingSystem:String){
    init {
        println("OS $operatingSystem is installing, please wait.")
    }
}

class TheCar{
    var module:String = ""
    var topSpeed = 100
    init {
        println("This car is a model $module and has a top speed of $topSpeed")
    }
}