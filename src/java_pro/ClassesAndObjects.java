package java_pro;

class Nokia{
    private int mic;
    private int cam;

    private String micName;
    private String camName;
    void setValue(){

        mic = 12;
        cam = 20;
        micName = "JBL";
        camName = "Sony";
    }
    void display(){

        System.out.println(mic);
        System.out.println(cam);
        System.out.println(micName);
        System.out.println(camName);

    }
}
public class ClassesAndObjects {
    public static void main(String[] args) {

        Nokia n1 = new Nokia();
        n1.setValue();
        n1.display();

    }
}


