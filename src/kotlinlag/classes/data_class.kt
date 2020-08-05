package kotlinlag.classes

fun main() {
    val user = User("Emmanuel", "emmaniel@gmail.com", "xfcgjvhBJN")
    println(user)
    val user1 = User("Henry", "henry@gmail.com", "nvkj47kbk")
    val user2 = User("Fiona", "fiona@gmail.com", "iyrdgfrr4")
    val user3 = RegularUser("Nathan", "nathan@gmail.com", "jhkjhsk434")
    println(user3)
    val user4 = user.copy(email = "emma@gmail.com")
    println(user4)
    println(user1 == user2)
}
class RegularUser(
    val name:String,
    val email:String,
    val password:String
)
data class User(
    val name:String,
    val email:String,
    val password:String)