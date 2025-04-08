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
    println("                                                                                                    ]      [ ")
    println("+--------+--------+--------+--------+--------+--------+--------+--------+--------+--------+--------+]      [+")
    println("|  @     |    o   |        |    o   |        |    o   |        |    o   |      o |        |        |        |")
    println("+--------+--------+--------+--------+--------+--------+--------+--------+--------+--------+--------+--------+")
    println("")
    println("Next? - Type the 'Enter' key to proceed")
    val answerToInstructions = readLine() ?: ""
    if (answerToInstructions.isNotEmpty())
        println("")
    println("@ = Gold Coin & o = Silver coin")
    println("Your goal is to collect the gold coin. You do this by moving it one space to the right of the board.")
    println("Till it eventually reaches the final section of the board, where then a player may take that coin off the grid.")
    println("The Gold Coin = @ will ALWAYS start on the far left, as the sliver Coins are scattered cross the board.")
    println("Taking Sliver coins = o, Will remove the coin from the game.")
    println("Next? - Type the 'Enter' key to proceed")
    println("")
    val answerToInstructionsTwo = readLine() ?: ""
    if (answerToInstructionsTwo.isNotEmpty())
        println("")
    println("The Gold Coin = @, CANNOT jump Silver Coins = o, And Silver Coins = o CANNOT jump other Silver Coins = o.")
    println("Each player gets one move (which includes taking the coin off the grid). Once this turn is done, its the other players turn.")
    println("And the game ends once the Gold Coin = @ is collected.")

    println("Ready To Play? - Type the 'Enter' key to proceed")

    val readyToPlay = readLine() ?: "Proceeding"
    if (readyToPlay.isNotEmpty()) {
        "Error"
    }
    val board = MutableList(gameLength + 1) { EMPTY }

    board[0] = GOLD

    board[3] = SILVER

    board[5] = SILVER

    board[8] = SILVER

    board[10] = SILVER

    board[13] = SILVER




    val gameOver = false
    val playerPlaying = 1

    while (!gameOver){
        print(board)


        val playerName = if (playerPlaying == 1) playerName else playerNameTwo

        println("It's \n$playerName's Turn")

        val playerChoice = readLine()?.toIntOrNull()
        println("Press (1) to move the 'GC', press (2) to move the 'SC' ")
        when (playerChoice)
    }
}

fun getString(prompt: String): String {
    var userInput: String
    while (true) {
        print(prompt)
        userInput = readln()
        if (userInput.isNotBlank())
            break

    }
    return userInput
}

