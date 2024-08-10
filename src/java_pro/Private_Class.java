package java_pro;

public class Private_Class {
    private static int x ;
    int y;

    void fun1 (){
        x = 5;
//        System.out.println(x);
    }
     static void fun2 (){
        System.out.println(x);
    }
}

class Program{
    public static void main(String[] args) {
        Private_Class p1 = new Private_Class();

        p1.fun1();
//        Private_Class.fun1();

        Private_Class.fun2();
    }
}

class StaticMember{

    public static void main(String[] args) {

        A a1 = new A();
        A a2 = new A();
        a1.fun1();
//        a2.fun3();
        a1.fun2();
        System.out.println("********************a2******************");
        a2.fun1();
        a2.fun2();
    }
}
class A{
    private int x;
    private static int y;

    void fun1 (){
        y =22;
        x = 5;
    }
    void fun2(){
        System.out.println(x);
        System.out.println(y);
    }
    void fun3(){
        y =45;
    }
}


