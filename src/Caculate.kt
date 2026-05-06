fun add(a: Int, b: Int): Int {
    return a + b
}

fun minus(a: Int, b: Int): Int {
    return a - b
}

fun sortedMinus(a: Int, b: Int): Int {
    if (a > b) a - b
    return b - a
}