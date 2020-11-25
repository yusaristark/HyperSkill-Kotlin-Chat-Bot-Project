import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var counter = 0
    while (scanner.nextInt() != 0) {
        ++counter
    }
    println(counter)
}