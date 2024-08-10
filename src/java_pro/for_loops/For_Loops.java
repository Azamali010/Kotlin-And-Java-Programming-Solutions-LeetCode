package java_pro.for_loops;

public class For_Loops {
    public static void main(String[] args) {

        Day();

    }

    static void Day(){

        for (int i = 1; i <= 5; i++) {
            System.out.println("Day " + i);
            for (int j = 1; j <= 9; j++) {
                System.out.println(j+", " + (j+8) + "_" + (j+9) + " = Write Some Task");

            }
        }
    }
}
