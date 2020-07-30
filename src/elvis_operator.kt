fun main() {
    var catName:String? = null
    //catName = "Nie"
    //println(catName!!.length) program may crush
    println(catName?:"This cat has no name")
    println(catName?:"Nie".length)
    //println(catName!!.length) //No Error
}