package machine

import java.util.*
import kotlin.system.exitProcess

var water = 400
var milk = 540
var money = 550
var cups = 9
var coffeeBeans = 120
val scanner = Scanner(System.`in`)

fun main() {

    initialRequest()


}

fun initialRequest() {
    println("Write action (buy, fill, take, remaining, exit):")
    when (scanner.next()) {
        "buy" -> {sell()
            initialRequest()
        }
        "fill" -> {fillSupplies()
            initialRequest()
        }
        "take" -> {takeMoney()
            initialRequest()
        }
        "remaining" -> {status()
            initialRequest()
        }
        "exit" -> exitProcess(1)

    }
}

fun takeMoney() {
    println("I gave you $$money \n")
    money = 0
    initialRequest()

}

fun fillSupplies() {
    println("Write how many ml of water do you want to add:")
    water += scanner.nextInt()
    println("Write how many ml of milk do you want to add:")
    milk += scanner.nextInt()
    println("Write how many grams of coffee beans do you want to add:")
    coffeeBeans += scanner.nextInt()
    println("Write how many disposable cups of coffee do you want to add:")
    cups += scanner.nextInt()
    initialRequest()
    //status()
}

fun sell() {
    println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:")
    when (scanner.next()) {
        1.toString() -> {
            if (water >= 250 && coffeeBeans >= 16 && cups >= 1) {
                println("I have enough resources, making you a coffee!\n")
                water -= 250
                coffeeBeans -= 16
                money += 4
                cups -= 1
            } else {
                when {
                    water < 250 -> println("Sorry, not enough water!")
                    coffeeBeans < 16 -> println("Sorry, not enough coffee beans!")
                    cups < 1 -> println("Sorry, not enough disposable cups!")
                }
            }
        }
        2.toString() -> {
            if (water >= 350 && milk >= 75 && coffeeBeans >= 20 && cups >= 1) {
                println("I have enough resources, making you a coffee!\n")
                water -= 350
                milk -= 75
                coffeeBeans -= 20
                money += 7
                cups -= 1
            } else {
                when {
                    water < 350 -> println("Sorry, not enough water!")
                    coffeeBeans < 20 -> println("Sorry, not enough coffee beans!")
                    milk < 75 -> println("Sorry, not enough milk!")
                    cups < 1 -> println("Sorry, not enough disposable cups!")
                }
            }

        }
        3.toString() -> {
            if (water >= 200 && milk >= 100 && coffeeBeans >= 12 && cups >= 1) {
                println("I have enough resources, making you a coffee!\n")
                water -= 200
                milk -= 100
                coffeeBeans -= 12
                money += 6
                cups -= 1
            } else {
                when {
                    water < 200 -> println("Sorry, not enough water!")
                    coffeeBeans < 12 -> println("Sorry, not enough coffee beans!")
                    milk < 100 -> println("Sorry, not enough milk!")
                    cups < 1 -> println("Sorry, not enough disposable cups!")
                }
            }
        }
        "back" -> initialRequest()
    }
}


fun status() {
    println("The coffee machine has:\n" +
            "$water of water\n" +
            "$milk of milk\n" +
            "$coffeeBeans of coffee beans\n" +
            "$cups of disposable cups\n" +
            "$$money of money\n")
}
