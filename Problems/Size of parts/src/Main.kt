import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val n = scanner.nextInt()
    var ls = 0
    var ss = 0
    var ps = 0
    repeat(n) {
        val v = scanner.nextInt()
        if (v == 0) {
            ++ps
        } else if (v == 1) {
            ++ls
        } else if (v == -1) {
            ++ss
        }
    }
    println("$ps $ls $ss")
}