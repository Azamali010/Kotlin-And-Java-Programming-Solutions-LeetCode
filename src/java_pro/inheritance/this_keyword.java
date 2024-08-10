package java_pro.inheritance;

class Example{
    int x,y;
    void fun1(int x, int y){
        this.x = x;
        this.y = y;
    }
    void Display(){
        System.out.println(x);
        System.out.println(y);
    }
}

class Example1 extends Example{
    int x,y;
    void fun3(int x, int y){
        super.x = x;
        super.y = y;
    }
    void fun4(){
        System.out.println(super.x);
        System.out.println(super.y);
    }
}
public class this_keyword {

    public static void main(String[] args) {

        Example1 e2 = new Example1();
        e2.fun3(10,20);
        e2.fun4();

        Example e1 = new Example();
        e1.fun1(23,34);
        e1.Display();

    }
}
