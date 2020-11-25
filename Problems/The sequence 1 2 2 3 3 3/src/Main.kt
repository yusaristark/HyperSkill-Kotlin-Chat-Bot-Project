import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val n = scanner.nextInt()
    var counter = 0
    for (i in 1..n) {
        for (j in 1..i) {
            print("$i ")
            ++counter
            if (counter == n) {
                return
            }
        }
    }
}