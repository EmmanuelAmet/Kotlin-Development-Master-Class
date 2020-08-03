package oop

fun main() {
    val postNote = PostNote()
    postNote.message
    postNote.updateMessage("Meeting at 5 GMT")
    println(postNote.message)
    postNote.printMessage()

    val box = Box()
    println("Contents is ${box.content}")
    box.updateContent("Jewellery")
    println("Content is ${box.content}")
}

class Box{
    var content:String = ""
    fun updateContent(content:String){
        this.content = content
    }
}
class PostNote{
    var  message: String = "No message"
    fun updateMessage(message:String){
        this.message = message
    }
    fun printMessage(){
        println(this.message)
    }
}