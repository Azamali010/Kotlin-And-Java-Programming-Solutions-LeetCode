package java_pro;


public class NonStaticClass {

    public static void main(String[] args) {

        System.out.println("Main Function");

        Azm obj = new Azm();
        obj.fun1();
        obj.fun2();
        obj.fun3();

        Azm v1 = new Azm();
//        v1 = new Azm();
        v1.fun1();
        System.out.println("Value of x is: "+obj.x);
        System.out.println("Value of y is: "+obj.y);
    }
}

class Azm{
    int x=5;
    int y=3;
    void fun1(){
        System.out.println("A");
    }
    void fun2(){
        System.out.println("B");
    }
    void fun3(){
        System.out.println("C");
    }
}

