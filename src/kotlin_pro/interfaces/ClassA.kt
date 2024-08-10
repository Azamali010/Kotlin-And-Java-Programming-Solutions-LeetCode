package kotlin_pro.interfaces

import kotlin_pro.inheritance.ClassA


interface  Interface{


    fun calculation(a : Int, b : Int,c :Int,d:Int,e:Int) : Int
    fun operations(a : Int, b : Int,c :Int,d:Int,e:Int,f : Int) : Int
    fun countNum(n : Int): Int

}

class InterfaceClassA : Interface{


    override fun calculation(a: Int, b: Int, c: Int, d: Int, e: Int): Int {
        return (a + b) * c + d - e
    }

    override fun operations(a: Int, b: Int, c: Int, d: Int, e: Int, f: Int): Int {
        TODO("Not yet implemented")
    }

    override fun countNum(n: Int): Int {
        return (n*(n+1))/2
    }

}

//class InterfaceClassB : Interface{
//
//    override fun calculation(a: Int, b: Int, c: Int, d: Int, e: Int): Int {
//        TODO("Not yet implemented")
//    }
//
//    override fun operations(a: Int, b: Int, c: Int, d: Int, e: Int, f: Int): Int {
//        TODO("Not yet implemented")
//    }
//
//}

fun main() {

    val objA = InterfaceClassA()

    println( objA.calculation(1,2,3,4,5))
    println(objA.countNum(12))

}