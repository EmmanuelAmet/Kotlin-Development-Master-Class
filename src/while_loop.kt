fun main() {
    var puzzlePieces = 20
    var piecesPlaced = 0
    while(piecesPlaced < puzzlePieces){
        piecesPlaced++
        println("Placed pieces #$piecesPlaced")
    }

    var i = 0
    while(i < 10){
        i++
        println("$i How are you?")
    }

    var p = 20
    var pp = 0
    do{
        pp++
        println("Placed p #$pp")
    }while(pp < p)

    var a = 0
    var b = 0
    while(a <= 10){
        while(b <= 10){
            print("$a, $b\t")
            b++
        }
        a++
        b = 0
        println()
    }
}