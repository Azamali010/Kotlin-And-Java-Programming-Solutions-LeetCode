package kotlin_pro.enumandsealed

enum class Day(val number :Int) {

    Sunday(1),
    Monday(2),
    Tuesday(3),
    Wednesday(4),
    Thursday(5),
    Friday(6),
    Saturday(7);

    fun printFormattedDay(){
        println("Day is: $this")
    }
}

fun main() {

    val day = Day.Sunday
    println(day)
    println(day.number)

    for (i in Day.entries){
        println(i)
    }
    day.printFormattedDay()

}