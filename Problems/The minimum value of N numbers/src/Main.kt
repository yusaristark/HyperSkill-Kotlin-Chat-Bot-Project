import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val n = scanner.nextInt()
    var min = scanner.nextInt()
    repeat(n - 1) {
        val v = scanner.nextInt()
        if (v < min) {
            min = v
        }
    }
    println(min)
}