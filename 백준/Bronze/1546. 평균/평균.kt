import java.util.*

fun main() = with(Scanner(System.`in`)){
    var cnt = nextInt()

    var num = Array(cnt){0.0}
    var sum : Double = 0.0
    var max : Double = 0.0

    for(i in 0 until cnt){
        num[i] = nextDouble()
        if(max < num[i])
            max = num[i].toDouble()
    }

    for (i in 0 until cnt){
        num[i] = num[i]/max*100.toDouble()
        sum += num[i]
    }
    println(sum/(cnt).toDouble())

}
