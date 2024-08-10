package kotlin_pro

//class Exception {
//}

fun main() {

    var amount = "20"
    amount = "abc"

    try {
        println(amount.toInt())
    } catch (e:NumberFormatException){
        println("An Number Format Exception.")
    }catch (e:Exception){
        println("A General Exception")
    } finally {
        println("Exception has completed")
    }

    println("Hello🐼🐼🐼")



}