package java_pro.constructor;


class Nokia1{
    private int x;
    private int y;
    void fun1 (){
        System.out.println("Parent function 1 Executed");
    }

    void fun2(){
        System.out.println("Parent function 2 Executed");
    }

    Nokia1(int p , int q){
        x = p;
        y = q;
        System.out.println("Parent Constructor Executed");
        System.out.println(x);
        System.out.println(y);
    }

}

class Nokia2 extends Nokia1{

    void fun3 (){
        System.out.println("Child function 1 Executed");
    }

    void fun4(){
        System.out.println("Child function 2 Executed");
    }

    Nokia2(){
        super(10,20);
        System.out.println("Child Constructor Executed");
    }
}

public class Inherit {

    public static void main(String[] args) {

        Nokia2 N = new Nokia2();
        N.fun1();
        N.fun2();
        N.fun3();
        N.fun4();

    }
}