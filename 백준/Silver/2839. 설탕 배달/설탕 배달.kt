import java.util.*

fun main() = with(Scanner(System.`in`)){
    var kg = nextDouble()
    var cnt = 0

    while(kg>0.0){
        if(kg % 5.0 == 0.0){
            kg -= 5
            cnt += 1
        }
        else if(kg % 3.0 == 0.0){
            kg -= 3
            cnt += 1
        }
        else if(kg >= 5){
            kg -= 5
            cnt += 1
        }
        else if(kg >= 3){
            kg -= 3
            cnt += 1
        }
        else{
            cnt = -1
            break
        }
    }
    println(cnt)

}