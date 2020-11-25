import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val n = scanner.nextInt()
    var a = 0
    var b = 0
    var c = 0
    var d = 0
    repeat(n) {
        val v = scanner.nextInt()
        if (v == 5) {
            ++a
        } else if (v == 4) {
            ++b
        } else if (v == 3) {
            ++c
        } else if (v == 2) {
            ++d
        }
    }
    println("$d $c $b $a")
}