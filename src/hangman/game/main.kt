package hangman.game

import kotlin.random.Random

val words = listOf("Kotlin", "F#", "Java", "C#", "Go", "PHP", "Dart")
var word = ""
var guesses = arrayListOf<Char>()
var remainingGuesses = 6
var mistake = 0

fun main() {
    setUpGame()
}

fun printGameStatus(){
    when(mistake){
        0 -> print0Message()
        1 -> print1Mistake()
        2 -> print2Mistake()
        3 -> print3Mistake()
        4 -> print4Mistake()
        5 -> print5Mistake()
        6 -> print6Mistake()
    }
    print("Word: ")
    for(element in guesses)
        print("$element ")
    println("\nYou have $remainingGuesses guess(es) left")
}

fun setUpGame(){
    val wordIndex = Random.nextInt(words.size)
    word = words[wordIndex].toUpperCase()
    println(word)
    for(i in word.indices)
        guesses.add('_')

    var gameOver = false
    do{
        printGameStatus()
        println("Please enter a letter:")
        val input = readLine()?:""

        if(input.isEmpty()){
            println("That's not a valid input. Please try again")
        }else{
            val letter = input[0].toUpperCase()
            if(word.contains(letter)){
                for(i in word.indices){
                    if(word[i] == letter)
                        guesses[i] = letter
                }
                if(!guesses.contains('_')){
                    gameOver = true
                }else{
                    println("Oops, word not found")
                    remainingGuesses--
                    mistake++
                    if(mistake == 6){
                        gameOver = true
                    }
                }
            }
        }
    }while(!gameOver)

    if(mistake == 6){
        printGameStatus()
        println("Sorry, you lost")
    }else{
        println("Congratulations, you won.")
    }
}

fun print0Message(){
    println("  |------|")
    println("  |      |")
    println("  |       ")
    println("  |       ")
    println("  |       ")
    println("  |       ")
    println(" /|\\     ")
    println(" /|\\     ")
}

fun print1Mistake(){
    println("  |------|")
    println("  |      |")
    println("  |      0")
    println("  |       ")
    println("  |       ")
    println("  |       ")
    println(" /|\\     ")
    println(" /|\\     ")
}

fun print2Mistake(){
    println("  |------|")
    println("  |      |")
    println("  |      0")
    println("  |      |")
    println("  |      |")
    println("  |       ")
    println(" /|\\     ")
    println(" /|\\     ")
}

fun print3Mistake(){
    println("  |------|")
    println("  |      |")
    println("  |      0")
    println("  |      /|")
    println("  |      |")
    println("  |       ")
    println(" /|\\     ")
    println(" /|\\     ")
}

fun print4Mistake(){
    println("  |------|")
    println("  |      |")
    println("  |      0")
    println("  |      /|\\")
    println("  |       |")
    println(" /|\\     ")
    println(" /|\\     ")
}

fun print5Mistake(){
    println("  |------|")
    println("  |      |")
    println("  |      0")
    println("  |      /|\\")
    println("  |       |")
    println(" /|\\     /")
    println(" /|\\     ")
}

fun print6Mistake(){
    println("  |------|")
    println("  |      |")
    println("  |      0")
    println("  |      /|\\")
    println("  |       |")
    println(" /|\\     /\\")
    println(" /|\\     ")
}

