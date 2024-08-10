package kotlin_pro.classandobjects

class ClassAndObjects {
    private var someInt= 10
    val some1Int = 30
    val some2Int = 50
    fun x(){
        someInt = 3000
        println("My Name Is X:🐼")
        println(someInt)
    }
    fun add(a:Int,b:Int,c:Int):Int{
//        println("Sum Is: ${a+b+c}")
        return a+b+c

    }

}

fun main() {
    val obj  = ClassAndObjects()  // Object of Class ClassAndObjects

    obj.x()
   // println(obj.someInt)
    println(obj.some1Int)
    println(obj.some2Int)
    obj.add(12,12,12)
    obj.add(1,1,1)
    obj.add(2,2,2)
    println(obj.add(1,1,1))
    obj.x()

    //println(ClassAndObjects().x())
}