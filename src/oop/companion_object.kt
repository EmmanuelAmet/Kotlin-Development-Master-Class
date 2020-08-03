package oop

fun main() {
    println(Vehicles.provider())
    val course = KotlinCourse()
    println(course.getCourseInfo())
    KotlinCourse.getMetaData()
}

class KotlinCourse{
    fun getCourseInfo(){
        println("Kotlin is a powerful JVM language")
    }
    companion object{
        fun getMetaData(){
            println("Kotlin is not difficult to learn.")
        }
    }
}
class Vehicles{
    companion object{
        fun provider():String{
            return "Drive Safe"
        }
    }
}