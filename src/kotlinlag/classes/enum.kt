package kotlinlag.classes

fun main() {

    var currentState = GameState.STARTED
    for(i in 1..20){
        println("${currentState.ordinal +1}. $currentState")
        currentState = changeState(currentState)
    }
    val color = Colors.RED
    when(color){
        Colors.RED -> {println("You choose Red")}
        Colors.BLUE -> {println("You choose Blue")}
        Colors.GREEN -> {println("You choose Green")}
    }
    val primaryColors = PrimaryColors.RED
    when(primaryColors){
        PrimaryColors.RED -> {println("You choose Red")}
        PrimaryColors.BLUE -> {println("You choose Blue")}
        PrimaryColors.GREEN -> {println("You choose Green")}
    }
}
fun changeState(currentState: GameState): GameState{
    when(currentState){
        GameState.STARTED -> return GameState.PLAYING
        GameState.GAMEOVER -> return GameState.STARTED
        GameState.PLAYING -> return GameState.GAMEOVER
    }
}
enum class Colors{
    RED,
    GREEN,
    BLUE
}
enum class PrimaryColors(val timeUsed:Int){
    RED(120),
    GREEN(400),
    BLUE(100)
}
enum class GameState{
    STARTED,
    PLAYING,
    GAMEOVER
}