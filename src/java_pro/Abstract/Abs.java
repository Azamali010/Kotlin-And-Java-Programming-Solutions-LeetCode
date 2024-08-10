package java_pro.Abstract;


abstract class Demo{
    int x,y;
    abstract void fun1 ();
    abstract void fun4 ();
    void fun2(){
        System.out.println(x);
        System.out.println(y);
    }
}

class Demo1 extends Demo {
    int a,b;
    @Override
    void fun1() {
        x = 130;
        y = 240;
    }

    @Override
    void fun4() {
        this.a=x;
        this.b=y;
    }
    void fun5(){
        System.out.println(a);
        System.out.println(b);
    }
}

public class Abs {
    public static void main(String[] args) {

        Demo1 d1 = new Demo1();
        d1.fun1();
        d1.fun2();
        d1.fun4();
        d1.fun5();

//        Demo d = new Demo(); //'Demo' is abstract; cannot be instantiated
//        d.fun1();
//        d.fun2();
    }
}
