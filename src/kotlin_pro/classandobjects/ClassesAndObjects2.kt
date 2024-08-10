package kotlin_pro.classandobjects


 open class Phone(){

    private lateinit var comp : String
    private lateinit var brand : String
    private lateinit var model : String
    private lateinit var ram : String
    private lateinit var memory : String



     fun setAll(){
         comp = "Google"
         brand = "Pixel"
         model = "6A"
         memory = "256GB"
         ram = "8GB"
     }
     fun displayAll(){
         println(comp)
         println(brand)
         println(model)
         println(memory)
         println(ram)
     }
}
class Nokia :Phone(){


    fun phone(){

    }
    init {

    }

}

fun main() {

    val obj2 = Nokia()
    obj2.setAll()
    obj2.displayAll()


}