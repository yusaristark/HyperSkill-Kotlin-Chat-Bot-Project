import java.util.*

// write your function here

fun isVowel(ch: Char): Boolean {
    val arr = charArrayOf('a', 'e', 'i', 'o', 'u')
    return ch.toLowerCase() in arr
}
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val letter = scanner.next()[0]

    println(isVowel(letter))
}