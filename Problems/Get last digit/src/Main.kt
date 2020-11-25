import java.util.*

// write your code here

fun getLastDigit(num: Int): Int = kotlin.math.abs(num % 10)

/* Do not change code below */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    println(getLastDigit(a))
}