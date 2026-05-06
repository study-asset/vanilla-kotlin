data class User(
    val id: Int,
    val name: String,
    val age: Int,
    val phone: String
)

fun getUserInfo() {
    val user = User(1, "Kotlin", 20, "010-0000-0000")
    print("User info: $user, user name is ${user.name}")
}