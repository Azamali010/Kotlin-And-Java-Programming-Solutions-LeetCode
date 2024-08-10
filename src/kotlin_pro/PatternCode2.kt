package kotlin_pro
//
//fun main() {
//    val n = readln().toInt()
//    // n = 3
//    var x = (n + n + n) - 2
//
//
//    for (i in 1..n) {
//        repeat(i) {
//            print('*')
//        }
//        if (i == n) {
//            repeat(x) {
//                print('@')
//            }
//            x -= 2
//        } else {
//            repeat(x) {
//                print(' ')
//            }
//            x -= 2
//        }
//        repeat(i) {
//            print('*')
//        }
//        println()
//    }
//
//
//    for (i in 1 until n) {
//        repeat(n) {
//            print(' ')
//        }
//        repeat(n) {
//            print('@')
//        }
//        println()
//    }
//
//
//    var k = n
//    var stars = n
//    for (l in n downTo 1) {
//        repeat(k) {
//            print(' ')
//        }
//        repeat(stars) {
//            print('*')
//        }
//        println()
//        k += 1
//        stars -= 2
//    }
//}
//

fun main() {
    val rows = 11
    val cols = 11

    for (i in 0 until rows) {
        for (j in 0 until cols) {
            when {
                (i in 0..3 && j == 0) || (i in 0..3 && j == cols - 1) || // Left and right vertical "e" lines at top
                        (i == 0 && j in 0..3) || (i == 0 && j in 7..10) || // Top horizontal "e" lines
                        (i == 7 && j in 0..3) || (i == 7 && j in 7..10) || // Bottom horizontal "e" lines
                        (i == 10 && j == 0) || (i == 10 && j == cols - 1) || // Bottom left and right "e" corners
                        (i == 3 && j in 5..6) || (i == 7 && j in 5..6) || // Middle horizontal "e" lines
                        (i in 4..6 && j == 0) || (i in 4..6 && j == cols - 1) -> print("e ")

                (i in 4..6 && j in 1..9) -> print("x ") // Center "x" block
                else -> print("  ") // Empty spaces
            }
        }
        println()
    }
}


