package kotlin_pro.companionObject

class Comp{

    var  a = 20
    var num =100
    companion object{
        var  someNumber = 10
        fun callMe(){
            println("This is Methods")
        }
        fun product(x:Int,y:Int) : Int {
            return x+y
        }
    }
}

fun main() {

    val comp_Obj = Comp()

    println(comp_Obj.a)
    println(comp_Obj.num)

    println(Comp.someNumber)
    Comp.callMe()

    println(Comp.product(100,10))
    println(Comp.product(1,10))
    println(Comp.product(1,1))
}