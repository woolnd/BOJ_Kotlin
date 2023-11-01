import java.util.*
import kotlin.math.*


fun main() = with(Scanner(System.`in`)){
    var case = nextInt()
    var result = Array(case){0}

    for(i in 0 until case){
        val x1 = nextDouble()
        val y1 = nextDouble()
        val r1 = nextDouble()
        val x2 = nextDouble()
        val y2 = nextDouble()
        val r2 = nextDouble()

        val distance = sqrt((x1-x2).pow(2) + (y1-y2).pow(2))
        when{
            distance == 0.0 && r1 == r2 -> result[i] = -1
            distance > r1 + r2 || distance < abs(r1 - r2) || (distance == 0.0 && r1 != r2) -> result[i] = 0
            distance == r1 + r2 || distance == abs(r1 -r2) -> result[i] = 1
            distance < r1 + r2 || distance > abs(r1 - r2) -> result[i] = 2
        }
    }
    for (i in 0 until case){
        println(result[i])
    }
}