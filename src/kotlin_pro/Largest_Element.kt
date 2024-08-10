package kotlin_pro

//class Largest_Element {
//}

fun main() {
    val arr = arrayOf(1,9,6,4,3,20)
    var count = 0

    for(i in arr.indices){

        if(arr[i] > arr[count]){
            count = i
        }
    }
//    println(count)
    println(arr[count])
}