package java_pro.Array_2d;

import java.util.*;

public class Matrixs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter The No of Rows: ");
        int r = sc.nextInt();

        System.out.print("Enter The No of Cols: ");
        int c = sc.nextInt();


        System.out.println("Enter The Elements of Rows & Cols: ");
        int[][] matrix = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
