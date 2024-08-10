package kotlin_pro

fun main(){

        val t = readln().trim().toInt()
    
        repeat(t) {

            val n = readln().trim().toInt()

            var sum = 0
            var num = n

            while (num > 0) {
                sum += num % 10
                num /= 10
            }
            println(sum)
        }
}


/*

This Kotlin code reads an integer T from the input,
which represents the number of test cases.
Then, for each test case,
it reads another integer N,
calculates the sum of its digits,
and prints the result.

Here's a breakdown of the code:

val T = readLine()!!.trim().toInt(): Reads a line from the input,
removes any leading or trailing whitespace using trim(),
and converts it to an integer T, which represents the number of test cases.

repeat(T) { ... }: Repeats the following block of code T times, once for each test case.

val N = readLine()!!.trim().toInt(): Reads a line from the input,
removes any leading or trailing whitespace using trim(),
and converts it to an integer N,
which is the number for which we need to calculate the sum of digits.

var sum = 0: Initializes a variable sum to store the sum of digits of N.

var num = N: Initializes a variable num to store a copy of N because we will be modifying num in the following steps.

while (num > 0) { ... }: Loops through each digit of num until num becomes 0.

sum += num % 10: Adds the last digit of num to sum (the remainder of num divided by 10).

num /= 10: Removes the last digit of num by integer division by 10.

After the loop, sum contains the sum of digits of N.
println(sum): Prints the sum of digits of N for each test case.

 */