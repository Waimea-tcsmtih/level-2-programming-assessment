/**
 * =====================================================================
 * Programming Project for NCEA Level 2, Standard 91896
 * ---------------------------------------------------------------------
 * Project Name:   Counter Coin
 * Project Author: Taine Smith
 * GitHub Repo:    GITHUB REPO URL HERE
 * ---------------------------------------------------------------------
 * Notes: This is a two-player game, played on a one-dimensional grid with coins, where the aim is to win by being the player who removes the gold coin.
 * PROJECT NOTES HERE
 * Start by asking for each players names (this for the end screen). Each player will be "Player 1" & or "Player 2", however it should show who is what "Player" by their inputted name
 * Make the coins, and assign them different values (Silver coin - silverCoin1) as there will be multiple coins.
 * =====================================================================
 */
const val gameLength = 15

const val GOLD = "GC"

const val SILVER = "SC"

const val EMPTY = ""


fun main() {
    println("")
    println("---------------------------------------------")
    println(
        "                             __                   \n" +
                "                            /\\ \\__                \n" +
                "  ___    ___   __  __    ___\\ \\ ,_\\    __   _ __  ©\n" +
                " /'___\\ / __`\\/\\ \\/\\ \\ /' _ `\\ \\ \\/  /'__`\\/\\`'__\\\n" +
                "/\\ \\__//\\ \\L\\ \\ \\ \\_\\ \\/\\ \\/\\ \\ \\ \\_/\\  __/\\ \\ \\/ \n" +
                "\\ \\____\\ \\______ \\____/\\ \\_\\ \\_\\ \\__\\ \\____\\\\ \\_\\ \n" +
                " \\_____/\\____/\\_\\/______\\/_/\\/_/\\/__/\\/____/ \\/_/ \n" +
                " /'___\\ / __`\\/\\ \\ /' _ `\\                        \n" +
                "/\\ \\__//\\ \\L\\ \\ \\ \\/\\ \\/\\ \\                       \n" +
                "\\ \\____\\ \\____/\\ \\_\\ \\_\\ \\_\\                      \n" +
                " \\/____/\\/___/  \\/_/\\/_/\\/_/                      "
    )
    println("---------------------------------------------")
    println("")
    println("Game Origins: Steve Copley" + " " + "&" + " " + "Digital Remake: Taine Smith")

    println("")
    println("")
    println("You will be player 1")
    val playerName = getString("Enter Player 1's Name: ")
    println("you will be player 2")
    val playerNameTwo = getString("Enter Player 2's Name: ")

    println("Player 1 = $playerName")
    println("Player 2 = $playerNameTwo")
    println("")
    println("Ok here are the rules")
    println("")
    println("This grid will be your playing field.")
    println("")
    println("+--------+--------+--------+--------+--------+--------+--------+--------+--------+--------+------------")
    println("|        |        |        |        |        |        |        |        |        |        |            |")
    println("+--------+--------+--------+--------+--------+--------+--------+--------+--------+--------+--------+---")
    println("")
    println("Next? - Type the 'Enter' key to proceed")
    val answerToInstructions = readLine() ?: ""
    if (answerToInstructions.isNotEmpty()) println("")
    println("")
    println("+--------+--------+--------+--------+--------+--------+--------+--------+--------+--------+------------")
    println("|  GC    |    SC   |       |   SC  |         |    SC   |        |    SC  |   SC  |       |            |")
    println("+--------+--------+--------+--------+--------+--------+--------+--------+--------+--------+--------+---")
    println("")
    println("Coins will be randomly scattered across the board")
    println("GC = Gold Coin & SC = Silver coin")
    println("Your goal is to collect the gold coin. You do this by moving it to the last spot on the right of the board.")
    println("This means the player who moves it to this position, wins.")
    println("Taking Sliver coins to the end of the board on the right will remove them from the game.")
    println("Next? - Type the 'Enter' key to proceed")
    println("")
    val answerToInstructionsTwo = readLine() ?: ""
    if (answerToInstructionsTwo.isNotEmpty()) println("")
    println("All coins CANNOT jump over each other.")
    println("Each player gets one move each turn. Once this turn is done, its the other players turn.")
    println("And the game ends once the Gold Coin is collected by a player.")
    println("Ready To Play? - Type the 'Enter' key to proceed")
    val readyToPlay = readLine() ?: "Proceeding"
    if (readyToPlay.isNotEmpty()) {
        println("")
    }

    val coins = mutableListOf<String>()
    coins.add("SC")
    coins.add("SC")
    coins.add("SC")
    coins.add("SC")
    coins.add("SC")
    coins.add("GC")
    coins.add(EMPTY)
    coins.add(EMPTY)
    coins.add(EMPTY)
    coins.add(EMPTY)
    coins.add(EMPTY)
    coins.add(EMPTY)

    coins.shuffle()





    var playerPlaying = 1
    var gameOver = false

    while (!gameOver) {
        displayBoard(coins)

        println("It's ${if (playerPlaying == 1) playerName else playerNameTwo}'s Turn")

        println("Press (1) to move the 'GC', press (2) to move the 'SC' ")
        val playerChoice = readLine()?.toIntOrNull()

        when (playerChoice) {
            1 -> {
                println("Moving Gold Coin...")
                if (!moveGoldCoin(coins)) {
                    println("Cannot move Gold Coin. Blocked!")
                }
            }
            2 -> {
                println("Which Silver Coin would you like to move? (Enter index 0-${coins.size - 1})")
                //the && is used as both values, an example of this is silver != null && (which is both of the silver coins) are unable to surpass one another.
                val SILVER = readLine()?.toIntOrNull()
                if (SILVER != null && SILVER in 0 until coins.size) {
                    if (SILVER + 1 < coins.size && coins[SILVER + 1] == EMPTY) {
                        coins[SILVER] = EMPTY
                        coins[SILVER + 1] = "SC"
                    } else {
                        println("Cannot move Silver Coin. Blocked!")
                    }
                } else {
                    println("Invalid selection.")
                }
            }
            else -> println("Invalid choice. Please choose 1 or 2.")
        }

        if (coins.last() == GOLD) {
            gameOver = true
            println("Game Over! ${if (playerPlaying == 1) playerName else playerNameTwo} wins!")
        } else {
            playerPlaying = if (playerPlaying == 1) 2 else 1
            if (coins.last() == SILVER) {

            }
        }
    }
}

fun getString(prompt: String): String {
    var userInput: String
    while (true) {
        print(prompt)
        userInput = readln()
        if (userInput.isNotBlank()) break
    }
    return userInput
}
fun moveGoldCoin(board: MutableList<String>): Boolean {
    val index = board.indexOf(GOLD)
    if (index != -1 && index + 1 < board.size && board[index + 1] == EMPTY) {
        board[index] = EMPTY
        board[index + 1] = GOLD
        return true
    }
    return false
}

fun displayBoard(board: List<String>) {
    println("+${"-".repeat(5)}+".repeat(board.size))
    board.forEach {val coin = if (it == GOLD) "  GC   " else if (it == SILVER) "  SC   " else "      "




        print("|$coin")
    }
    println("|")
    println("+${"-".repeat(5)}+".repeat(board.size))
}