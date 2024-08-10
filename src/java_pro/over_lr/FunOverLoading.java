package java_pro.over_lr;

class OverLoad{
    private int x  ,y;
    void Area(int x, int y){
        this.x = x;
        this.y = y;
    }
    void Area(double a,double b, double c){
        double S  = (a + b + c)/2;
        double area = Math.sqrt(S*(S-a)*(S-b)*(S-c));
        System.out.println(area);
    }

    void Area(int a,int b, int height){
        int area =(height * (a+b))/2;
        System.out.println(area);
    }
    void Area(double diagonal1,double diagonal2){
        double area = (diagonal1 * diagonal2)/2;
        System.out.println(area);
    }
}
class OverLoad1 {


    void Area(double a,double b, double c){
        double S  = (a + b + c)/2;
        double area = Math.sqrt(S*(S-a)*(S-b)*(S-c));
        System.out.println(area);
    }

    void Area(int a,int b, int height){
        int area =(height * (a+b))/2;
        System.out.println(area);
    }
    void Area(double diagonal1,double diagonal2){
        double area = (diagonal1 * diagonal2)/2;
        System.out.println(area);
    }
}

public class FunOverLoading {

    public static void main(String[] args) {

        OverLoad  obj1 = new OverLoad();
        obj1.Area(10.0,10.0,10.0);
        obj1.Area(10,10,10);
        obj1.Area(13.0,59.0);


    }
}
