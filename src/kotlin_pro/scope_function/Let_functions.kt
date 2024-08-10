package kotlin_pro.scope_function

fun main() {

    val emp = Emp()

    emp.name = "Azam"
    emp.salary = 1000
    emp.age = 23

    var res = emp.let {
        println(it.age)
        println(it.name)
        println(it.salary)
        

    }

}
data class Emp(var name:String = "", var age:Int = 20, var salary:Int = 208987)