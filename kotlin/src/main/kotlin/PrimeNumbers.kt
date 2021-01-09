fun isPrimeNumber(number: Int): Boolean {
    if (number <= 1) return false

    if (number == 2) return true

    for (i in 2 until number) {
        if (number % i == 0) return false
    }

    return true
}

fun main() {
    println(isPrimeNumber(1))
}
