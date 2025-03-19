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



fun main() {
    println("")
    println("---------------------------------------------")
    println("Counter Coin")
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

    println("Would You Like To Play?")
    val answerStart = getStrings ("")


}


    fun getStrings(prompt: String)  {
        var answerStart : String


        if answer = ""{
            println("Yes, Lets Continue!")
        }

        else if (prompt == "No") {
            println("Ok")

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