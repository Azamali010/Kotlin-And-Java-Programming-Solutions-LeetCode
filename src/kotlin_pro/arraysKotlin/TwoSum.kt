package kotlin_pro.arraysKotlin

//fun main() {
//    val ans = arrayOf(2)
//    val nums = arrayOf(4,1,2,3,8)
//    val target = 5
//    for (i in nums.indices){
//        for (j in i+1..nums.size){
//            if (nums[i] + nums[j] == target){
//                ans[0] = i
//                ans[1] = j
//                break
//            }
//        }
//    }
//    println(ans)
//}

fun main() {
    val ans = IntArray(2)
    val nums = intArrayOf(4, 1, 2, 3, 8)
    val target = 5

    for (i in nums.indices) {
        for (j in i + 1 until nums.size) {
            if (nums[i] + nums[j] == target) {
                ans[0] = i
                ans[1] = j
                break
            }
        }
    }

    println("Indices: [${ans.joinToString()}]")
}
