import java.util.*

var height = 0
var width = 0
lateinit var arr : Array<IntArray>

fun main() = with(Scanner(System.`in`)){
    height = nextInt()
    width = nextInt()

    var rain = 0

    arr = Array(height){IntArray(width){0} }


    for(i in 0 until width){
        var num1 = nextInt()
        for(j in height-1 downTo height-num1){
            arr[j][i] = 1
        }
    }
    
    for(i in height-1 downTo 0){
        for(j in 0 until width){
            if(arr[i][j] == 0){
                if(Left(i, j-1)){
                    if(Right(i, j+1)){
                        rain ++
                    }   
                }
            }
        }
    }
    
    println(rain)
}

fun Left(i: Int, j: Int): Boolean{
    if(j>=0){
        return if(arr[i][j] == 1) true
        else Left(i, j-1)
    }
    return false
}

fun Right(i: Int, j: Int): Boolean{
    if(j<width){
        return if(arr[i][j] == 1) true
        else Right(i, j+1)
    }
    return false
}