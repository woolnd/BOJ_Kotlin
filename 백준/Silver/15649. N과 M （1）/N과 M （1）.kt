lateinit var visited: Array<Boolean>
lateinit var arr: Array<Int>

var n = 0
var m = 0

fun main(){
    var (a, b) = readLine()!!.split(" ").map{it.toInt()}

    n = a
    m = b
    arr = Array(n+1){i -> i}
    visited = Array(n+1){false}
    
    dfs(0, "")
}

fun dfs(len: Int, str: String){
    if(len == m){
        println(str)
        return
    }

    for(i in 1 .. n){
        if(!visited[i]){
            visited[i] = true

            if(len == 0)
                dfs(1, arr[i].toString())
            else
                dfs(len+1, "$str ${arr[i]}")
            visited[i] = false
        }
    }
}