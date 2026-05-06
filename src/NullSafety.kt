import kotlin.random.Random

fun nullSafety() {
    val random = Random.nextInt(2)
    val nicknameArr = arrayOf("Kotlin", null)

    val nickname: String? = nicknameArr[random]

    println(nickname?.length) // 6 or null
}