package kotlin_pro.inheritance

open class ClassA {

    private lateinit var name : String
    private lateinit var age : String
    private lateinit var education: String
    private lateinit var phoneNumber :String
    private lateinit var idnumber :String
    private lateinit var city : String
    private lateinit var state :String

    open fun setUserData(){

        name = "Qadeer"
        age = "120"
        education = "MCA"
        phoneNumber = "1234567890"
        idnumber = "12345"
        city = "Rampur"
        state = "UP"

    }
    fun displayUserData(){

        println("Name: $name")
        println("Age Is: $age Years")
        println("Education Is: $education")
        println("Phone Number Is: $phoneNumber")
        println("Id Number Is: $idnumber")
        println("City: $city")
        println("State Is: $state")

    }
}

class ClassAzam : ClassA(){

}
open class ClassC{}
class ClassD(
    Name: String,
    Age : String
):ClassA(){


}

fun main() {

    val classB = ClassAzam()
    classB.setUserData()
    classB.displayUserData()

}