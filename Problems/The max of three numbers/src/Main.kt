import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()

    println(if (a > c) {
        // put your code here
        if (a > b) {
            a
        } else {
            b
        }
    } else {
        // and here
        if (c > b) {
            c
        } else {
            b
        }
    })
}