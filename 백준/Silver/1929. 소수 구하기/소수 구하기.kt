import java.util.*
import kotlin.math.sqrt

fun main() = with(Scanner(System.`in`)){
    var N = nextInt()
    var M = nextInt()
    val check = BooleanArray(M + 1)

    for (i in check.indices) check[i] = true

    val sqrt = sqrt(M.toDouble()).toInt()
      for (i in 2..sqrt) {
          if (check[i]) {
              var j = i
              while (j * i <= M) {
                  check[i * j] = false
                  j++
              }
          }
      }
      for (i in N..M) {
          if (i == 1) continue
          if (check[i]) println(i)
      }
}