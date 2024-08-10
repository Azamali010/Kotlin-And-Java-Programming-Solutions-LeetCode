package kotlin_pro

class List_In_Kotlin {

    companion object{

        @JvmStatic
        fun main(args: Array<String>) {

            println("***************** Immutable_List *********************")
            val aList = listOf<Any>(23.0,"AB","ABC", listOf(1,2,3,4),"ABCD","ABCDE","ABCDEF","ABCDEFG",2,5,3,8,90)
            println(aList)

            println("***************** mutable_List *********************")

            val mList = mutableListOf<Any>("ABC","ABCDE",21)
            mList.add("A")
            mList.add(23)

            println(mList)


            val num = 2345
            digits(num)

        }

        private fun digits(num: Int) {
           var count = 0
            while (num > 0){
                count = num % 10
                count++
                
            }
        }
    }
}