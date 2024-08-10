data class Person(var name: String, var age: Int, var city: String) {
    fun moveTo(newCity: String) {
        city = newCity
    }
    fun incrementAge() {
        age++
    }
    fun sum(a :Int, b :Int) {
        println(a+b)
    }
}

fun main() {
    val p = Person("azauuuu",23,"")
    Person("Alice", 20, "Amsterdam").let {
        println(it)
        it.moveTo("London")
        it.incrementAge()
        println(it)
        it.sum(2,5)
    }
    println(p.name)
}