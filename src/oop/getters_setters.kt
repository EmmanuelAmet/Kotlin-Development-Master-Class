package oop

fun main() {
    val wiredCar = WiredCar()
    wiredCar.speed = 100
    println("Car name ${wiredCar.name} and speed ${wiredCar.speed}")

    val account = Bank()
    account.account = 343
    account.account = 535
    account.account = 344

    val bank = BankInterest()
    bank.amount = 120
    bank.amount = 10000
    bank.amount = 20000
}

class Bank{
    var creditRating = 500
    var account:Int = 0
    get() = field
    set(value) {
        if(value > account){
            creditRating++
        }else{
            creditRating--
        }
        field = value
        println("New credit rating is $creditRating")
    }
}
class WiredCar{
    var name = ""
    var speed: Int
        get() = 50
    set(value) {
        name = "High speed car"
    }

}

class BankInterest{
    var interestRate = 0.0
    var amount:Int = 0
    get() = field
    set(value) {
        if(value < 1000)
            interestRate = 1.0
        else if(value < 10000)
            interestRate = 0.5
        else
            interestRate - 0.2
        field = value
        println("The client has $value and the an interest of $interestRate")
    }

}