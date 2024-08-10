package kotlin_pro.classandobjects

class KotlinConstructor {


    private fun add(a:Int){

    }
   private fun add(a: Int,b: Int){

    }
    fun add(a: Int,b: Int,c: Int){

    }
    fun add(a: Int,b: Int,c: Int,d: Int){

    }



    constructor(a:Int){

     val num = a
     println(num)

    }
    constructor(a: Int,b: Int){

     val sum1 = a+b
     println(sum1)

    }
    constructor(a: Int,b: Int,c: Int){

     val sum2 = a+b+c
     println(sum2)

    }
    constructor(a: Int,b: Int,c: Int,d: Int){

     val sum3 = a+b+c+d
     println(sum3)

    }

}

fun main() {

  val obj = KotlinConstructor(23)
 obj.let {
  it.add(2,4,6,4)
 }

}