package java_pro.while_loop;

public class while_Loop {
    public static void main(String[] args) {

        First_n_Number();
        Sum_first_n_Number();
        factorial();
        Revers();
        AllEven();
    }

    static void First_n_Number(){
        int num = 0;
        while (num<=10){

            System.out.println(num);

            num++;
        }
    }
    static void Sum_first_n_Number(){

        int num = 0;
        int sum = 0;
        while (num<=10){
            sum += num;
            num++;
        }
        System.out.println("The Sum Is: " + sum);
    }
    static void factorial(){

        int num = 3;
        int fact = 1;
        while (num>0){
            fact *= num;
            num--;
        }
        System.out.println("factorial Is: "+fact);
    }

    static void Revers(){
        int num = 10271,rev = 0;
        while (num!=0){
            int digit = num%10;
            rev = rev*10+digit;

            num = num/10;
        }
        System.out.println("Revers Is: "+rev);
    }
    static void AllEven(){
        int num = 0;
        while (num<=10){
//            System.out.println(num);
            if (num%2==0){
                System.out.println(num);
            }
            num++;
        }
    }
}


/*
1. Print numbers from 1 to n: Write a program to print numbers from 1 to n using a while loop.
2. Sum of first n numbers: Calculate the sum of the first n natural numbers using a while loop.
3. Factorial of a number: Find the factorial of a given number using a while loop.
4. Reverse a number: Write a program to reverse a given integer using a while loop.
5. Check if a number is prime: Determine whether a given number is prime or not using a while loop.
6. Print even numbers: Print all even numbers between 1 and n using a while loop.
7. Multiplication table: Print the multiplication table of a given number using a while loop.
8. Fibonacci series: Generate the first n terms of the Fibonacci series using a while loop.
9. Power of a number: Calculate x raised to the power y using a while loop.
10.Find the GCD of two numbers: Find the greatest common divisor (GCD) of two numbers using a while loop
*/