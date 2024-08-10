package kotlin_pro

fun main() {
    val t = readln().toInt()
    repeat(t){
//        val(x,y) = readln().split(" ").map(String::toInt) // Input In String Format
        val x = readln().toInt()
        val y = readln().toInt()
        var totalA = 0


        for (i in 1..y){
            val value = if (i<=x){
                1
            }
            else{
                2
            }
            totalA += value
//            totalA += if (i<=x) 1 else 2
        }
        println(totalA)
    }
}



//fun main() {
//    val T = readLine()!!.toInt()
//
//    for (t in 0 until T) {
//        val (X, Y) = readLine()!!.split(" ").map(String::toInt)
//
//        var totalAmount = 0
//        for (i in 1.Y) {
//            totalAmount += if (i <= X) 1 else 2
//        }
//
//        println(totalAmount)
//    }
//}

//fun main() {
//    var T = readLine()!!.toInt()
//    var t = 0
//
//    while (t < T) {
//        val (X, Y) = readLine()!!.split(" ").map(String::toInt)
//
//        var totalAmount = 0
//        for (i in 1.Y) {
//            totalAmount += if (i <= X) 1 else 2
//        }
//
//        println(totalAmount)
//        t++
//    }
//}

