package oop

fun main() {
    DatabaseAccess.connected = true
    if(DatabaseAccess.connected){
        DatabaseAccess.disconnected()
    }else{
        DatabaseAccess.connect()
    }
    println("Database is connected: ${DatabaseAccess.connected}")
}

object DatabaseAccess{
    var connected = false
    fun connect(){
        connected = true
        println("DB Connected.")
    }
    fun disconnected(){
        connected = false
        println("Disconnected from the DB")
    }
}