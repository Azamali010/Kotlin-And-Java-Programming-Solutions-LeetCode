package java_pro.constructor;

class Demo {
    int x;
    int y;
    Demo(){

        x = 10;
        y = 20;
//        System.out.println("Constructor 1 Executed");
    }

    void fun1(){

        x = 100;
        y = 200;

//        System.out.println("Constructor 2 Executed");
    }
}

class Construct{
    public static void main(String[] args) {

        Demo d1 = new Demo();

        d1.fun1();
        System.out.println(d1.x);
        System.out.println(d1.y);


    }
}