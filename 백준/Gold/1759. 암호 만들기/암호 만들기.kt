import java.util.*

lateinit var visited: Array<Boolean>
lateinit var arr: Array<String>

var l: Int = 0
var c: Int = 0
var vowels = setOf("a", "e", "i", "o", "u")
val result = mutableListOf<String>()

fun main() = with(Scanner(System.`in`)) {
    l = nextInt()
    c = nextInt()
    arr = Array(c) { next() }
    arr.sort()
    visited = Array(c) { false }
    dfs(0, "", 0)
}

fun dfs(len: Int, str: String, start: Int) {
    if (len == l) {
        if (hasRequiredCounts(str))
            println(str)
        return
    }

    for (i in start until c) {
        if (!visited[i]) {
            visited[i] = true
            if (len == 0)
                dfs(len + 1, arr[i], i)
            else
                dfs(len + 1, "$str${arr[i]}", i)
            visited[i] = false
        }
    }
}

fun hasRequiredCounts(str: String): Boolean {
    val vowelCount = str.count { it.toString() in vowels }
    val consonantCount = str.length - vowelCount
    return vowelCount >= 1 && consonantCount >= 2
}