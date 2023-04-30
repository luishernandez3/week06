import java.util.*
// jose hernandez 4.30.23
fun main() {
    val scanner = Scanner(System.`in`)
    var currentRoom = "dusty castle room"
    var direction: String
    
    while (true) {
        when (currentRoom) {
            "dusty castle room" -> {
                println("You are in a dusty castle room.")
                println("Passages lead to the north and south.")
                direction = scanner.nextLine().trim().toLowerCase()
                when (direction) {
                    "n" -> currentRoom = "armory"
                    "s" -> currentRoom = "torch-lit hallway"
                    else -> println("Can't go that way.")
                }
            }
            "armory" -> {
                println("You are in the armory.")
                println("There is a room off to the south.")
                direction = scanner.nextLine().trim().toLowerCase()
                when (direction) {
                    "s" -> currentRoom = "dusty castle room"
                    else -> println("Can't go that way.")
                }
            }
            "torch-lit hallway" -> {
                println("You are in a torch-lit hallway.")
                println("There are rooms to the east and west.")
                direction = scanner.nextLine().trim().toLowerCase()
                when (direction) {
                    "e" -> currentRoom = "bedroom"
                    "w" -> currentRoom = "kitchen"
                    else -> println("Can't go that way.")
                }
            }
            "bedroom" -> {
                println("You are in a bedroom. A window overlooks the castle courtyard.")
                println("A hallway is to the west.")
                direction = scanner.nextLine().trim().toLowerCase()
                when (direction) {
                    "w" -> currentRoom = "torch-lit hallway"
                    else -> println("Can't go that way.")
                }
            }
            "kitchen" -> {
                println("You are in the kitchen. It looks like a roast is being made for supper.")
                println("A hallway is to the east.")
                direction = scanner.nextLine().trim().toLowerCase()
                when (direction) {
                    "e" -> currentRoom = "torch-lit hallway"
                    else -> println("Can't go that way.")
                }
            }
        }
    }
}
