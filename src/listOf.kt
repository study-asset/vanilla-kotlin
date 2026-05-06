fun listOf() {
    val users = listOf(
        User(0, "John", 20, "010-0000-0000"),
        User(1, "Carly", 20, "010-0000-0000"),
    )

    for (user in users) {
        println("Get user info in ${user.name}")
    }
}