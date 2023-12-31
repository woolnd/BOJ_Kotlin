fun main() {
    val (a, b, c) = readLine()!!.split(" ").map { it.toLong() }
    println(division(a, b, c))
}

private fun division(a: Long, b: Long, c: Long): Long {
    return when {
        b == 1L -> a % c
        b % 2 == 0L -> {
            val answer = division(a, b/2, c)
            (answer * answer) % c
        }
        else -> {
            val answer =  division(a, b/2, c)
            ((answer * answer%c) * a) % c
        }
    }
}