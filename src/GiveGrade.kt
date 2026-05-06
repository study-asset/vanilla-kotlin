import kotlin.random.Random

fun giveGrade(): String {
    val score = Random.nextInt(100)

    val grade = if (score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else {
        "C"
    }

    println("My score is $score also my grade is $grade")
    return grade
}