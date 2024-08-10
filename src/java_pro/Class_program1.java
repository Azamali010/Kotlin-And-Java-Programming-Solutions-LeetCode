package java_pro;

public class Class_program1 {

    public static void main(String[] args) {

        System.out.println("main");
        fun1();
        fun2();

        Area.fun1();
        Area.fun2();
    }
    static void fun1(){

        System.out.println("A");
    }
    static void fun2(){

        System.out.println("B");
    }
    void fun3(){

        System.out.println("B");
        // this function can not call in the main function because, this function is not static
    }

}
class Area{

    static void fun1(){
        System.out.println("Area1");
    }
    static void fun2(){
        System.out.println("Area2");
    }

}
