
data class User(val id: Long, var name: String)

fun main() {
    val user1 = User(1, "Mason")

    //Accessing a property in a data class
    val name = user1.name // Mason
    println(name)

    user1.name = "Kayla"

    val user2 = User(1, "Kayla")

    println(user1 == user2)

    println("User Details: $user1")

    // Copy Function

    val updatedUser = user1.copy(name = "Mason")
    println("User 1 = $user1")
    println("Updated user = $updatedUser")

    println(user1.component1()) // Prints 1 (id_
    println(user2.component2()) // Prints name of User 2 - (component == argument)


    // DECONSTRUCTION
    val (id,names) = updatedUser // This will take the id and name of updatedUser and place them into new variables
    println("id=$id, names=$names")


}