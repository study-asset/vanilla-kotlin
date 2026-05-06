fun nullable() {
    val name: String? = null
    val result = name ?: "Kotlin"
    println("Nullable result: $result")
}