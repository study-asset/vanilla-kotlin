import kotlin.random.Random

enum class Status {
    Loading,
    Pending,
    Success
}

fun useWhen() {
    val statusArr = arrayOf(Status.Loading, Status.Pending, Status.Success)
    val status = statusArr[Random.nextInt(statusArr.size)]

    when (status) {
        Status.Loading -> println("Loading")
        Status.Pending -> println("Pending")
        Status.Success -> println("Success")
    }
}