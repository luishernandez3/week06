import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val responses = arrayOf(
        "I don’t think so.",
        "Yes, of course!",
        "I’m not sure.",
        "It is certain.",
        "It is decidedly so.",
        "Without a doubt.",
        "Reply hazy, try again.",
        "Ask again later.",
        "Cannot predict now.",
        "Better not tell you now."
    )
    var continuePlaying = true

    while (continuePlaying) {
        println("Ask a yes or no question (or type 'quit' to exit):")
        val question = scanner.nextLine().trim().toLowerCase()

        if (question == "quit") {
            continuePlaying = false
        } else if (question.endsWith("?")) {
            val responseIndex = (0 until responses.size).random()
            println(responses[responseIndex])
        } else {
            println("That doesn't look like a yes or no question.")
        }
    }
}
