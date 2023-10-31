import java.util.*

fun main() = with(Scanner(System.`in`)){
    var num = nextInt()
    var cnt = 0
    var third: Int //백의 자리
    var second: Int //십의 자리
    var first: Int //일의 자리

    for (i in 1 .. num){
        if(i>0 && i<100){
        cnt += 1
        }
        else if(i>=100 && i<1000){
            third = i % 1000 / 100
            second = i % 100 / 10
            first = i % 100 % 10
            if(third - second == second - first){
                cnt += 1
            }   
        }
        else{

        }
    }
    println(cnt)
}