package java_pro.pattern;

public class pattern1 {

    public static void main(String[] args) {


//        P1(4);
//        P2(5);
//        P3(5);
//        P4(5);
//        P5(5);
//        printA();


    }

    static void P1(int n){

        for (int row = 1; row<=n; row++){
            for (int col = 1; col<=n; col++ ){
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static void P2(int n){
        for (int row = 1; row<=n; row++){
            for (int col = 1; col<=row & col>=row; col++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void P3(int n){
        for (int row = 1; row<=n; row++){
            for (int col = 1; col<=n-row+1; col++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void P4(int n){
        for (int row = 1; row<=n; row++){
            for (int col = 1; col<=row; col++ ){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    static void P5(int n){
        for (int row = 0; row< 2 * n; row++){
            int tcr = row > n ? 2*n-row :row;
            for (int col = 0; col<tcr; col++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printA() {
        int height = 7; // Height  A
        int width = (2 * height) - 1; // Width  A

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if ((j == (width / 2) - i) || (j == (width / 2) + i) || (i == height / 2 && j > (width / 2) - i && j < (width / 2) + i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
