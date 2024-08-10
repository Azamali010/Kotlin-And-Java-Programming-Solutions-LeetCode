package kotlin_pro


fun main() {

    student(23)
    score(78)
    days("Friday")
    evenOdd(24)
}
fun student(age:Int){

//    val age = 22
    val isStudent = true

    if (age >= 18) {
        if (isStudent) {
            println("Eligible for student discount")
        } else {
            println("Eligible for adult discount")
        }
    } else {
        println("Not eligible for any discount")
    }

}

fun score(score:Int){

//    val score = 85

    if (score >= 90) {
        println("Grade: A")
    } else if (score >= 80) {
        println("Grade: B")
    } else if (score >= 70) {
        println("Grade: C")
    } else {
        println("Grade: F")
    }
}


fun days(day:String){
//    val day = "Friday"

    when (day) {
        "Monday" -> println("Start of the week")
        "Tuesday", "Wednesday", "Thursday" -> println("Weekday")
        "Friday" -> println("Almost the weekend!")
        "Saturday", "Sunday" -> println("Weekend!")
        else -> println("Invalid day")
    }
}

fun evenOdd(num:Int){
//    val number = 19
    val result = if (num%2==0){
        "Even"
    }
    else{
        "odd"
    }
    println(result)
}

