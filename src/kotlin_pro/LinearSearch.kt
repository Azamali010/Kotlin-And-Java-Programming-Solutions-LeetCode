package kotlin_pro

//fun main() {
//    val arr = arrayOf(1,2,3,4,5)
//
//    for (i in arr.indices) {
//        val x = 4
//        if (arr[i] == x) {
//            println("yes $i")
//        }
//        else{
//            println("no")
//        }
//
//    }
//
//}

fun linearSearch(arr: IntArray, target: Int): Int {
    for (i in arr.indices) {
        if (arr[i] == target) {
            return i
        }
    }
    return -1
}

fun main() {
    val arr = intArrayOf(5, 2, 4, 6, 1, 3)
    val target = 4
    val result = linearSearch(arr, target)

    if (result != -1) {
        println("Element found at index: $result")
    } else {
        println("Element not found in the array $target")
    }
}
