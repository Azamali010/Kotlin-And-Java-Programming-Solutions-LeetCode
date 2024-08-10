package kotlin_pro

fun main() {

//    p1(5)
//    P2(5)
//    P3(5)
//    P4(4)
//    P6(5)
//    P7(7)
    P8()

}
fun p1(n: Int) {

    for (i in 1..n) {
        for (j in 1..n) {
            print("* ")
        }
        println()
    }

}


fun P2(n: Int) {
    for (row in 1..n) {
        for (col in 1..row) {
            print("* ")
        }
        println()
    }
}


fun P3(n: Int) {
    for (row in 1..n) {
        for (col in row..n) {
            print("* ")
        }
        println()
    }
}

fun P4(num: Int) {

    var ch = 'A'

    for (row in 1..num) {
        for (col in 1..row) {
            print("$ch ")
            ch++
        }
        println()
    }
}
fun P6(num: Int) {

    for (i in 1..num){
        for (j in 1..i) {
            print("$j ")
        }
        println()
    }
}

fun P7(num: Int) {

    for (i in 1..num) {
        for (j in 1..num - i) {
            print(" ")
        }

        for (k in 1..i) {
            print("$k ")
        }
        println()
    }
}
fun P8() {
        val rows = 4
        var num = 1
        for (i in 1..rows) {
            for (j in 1..i) {
                print("$num ")
                num++
            }
            println()
        }
}



//fun main() {
//    val number = 7
//
//    if (number % 2 == 0) {
//        println(-1)
//    } else {
//        val num = 4
//        for (i in 1..num ){
//            println("e")
//        }
//        val n = number / 2 + 1
//        for (i in 1..n) {
//            for (j in 1..n) {
//                print("* ")
//            }
//            println()
//        }
//
//        for (i in 1..n) {
//            for (j in 1..n) {
//                print("* ")
//            }
//            print("e e e e")
//            break
//            println()
//        }
//    }
//}






