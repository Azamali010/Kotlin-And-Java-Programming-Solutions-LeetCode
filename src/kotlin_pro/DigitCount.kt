package kotlin_pro



fun main() {

//    var number :Int = 2345
    val number = readln().toInt()
    digitCount(number)
}

fun digitCount(number:Int) {
    var count = 0
    var sum = 0
    var num = number
    while (num>0){
        val res = num%10
        println("Digit Is: $res")
        sum += res
        count++
//        num = num/10
        num /= 10

        count++

    }
    println("Total Digit Is $count")
    println("Sum Is: $sum")

}

