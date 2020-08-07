package other.concepts
/*
Common Uses
1. Dependancy injection
2. Unit testing
 */
fun main() {
    lateinit var networkService:String
    networkService = getNetworkService()
    println(networkService)
}
fun getNetworkService() = "Network service"