package kotlin_pro

fun main() {
    lateinit var  name1: String
    lateinit var  name2: String
    name1 = null.toString()
    name2 = "Ali"

    val result = name1 ?: name2
    println(result)

}