package kotlin_pro
/*
Scalene Triangle
Given
𝐴
,
𝐵
,
A,B, and
𝐶
C as the sides of a triangle, find whether the triangle is scalene.

Note:

A triangle is said to be scalene if all three sides of the triangle are distinct.
It is guaranteed that the sides represent a valid triangle.
Input Format
The first line of input will contain a single integer
𝑇
T, denoting the number of test cases.
Each test case consists of three space-separated integers
𝐴,𝐵
A,B, and 𝐶
C — the length of the three sides of the triangle.
Output Format
For each test case, output on a new line, YES, if the triangle is scalene, and NO otherwise.
You may print each character of the string in uppercase or lowercase. For example, YES, yes, Yes, and yEs are all considered identical.

Constraints
1≤𝑇≤1001≤T≤100 1≤𝐴≤𝐵≤𝐶≤10
1≤A≤B≤C≤10
𝐶<(𝐴+𝐵)
C<(A+B)
Sample 1:
Input
4
2 3 4
1 2 2
2 2 2
3 5 6
Output
YES
NO
NO
YES
 */

fun main(){
    val t = readln().toInt()
    repeat(t) {
        val (A,B,C) = readln().split(" ").map(String::toInt)
        if(A!=B && B!=C && C!=A){
            println("YES")
        }else{
            println("NO")
        }

    }
}
