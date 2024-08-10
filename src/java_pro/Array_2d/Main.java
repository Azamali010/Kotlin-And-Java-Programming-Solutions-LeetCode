package java_pro.Array_2d;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (matrix[i][j] == x) {
                    System.out.print(" ,"+i + " "+ j + " The Element Is: " +x);
                }
//                System.out.print(matrix[i][j]);
            }
//            System.out.println();
        }
    }
}

/*
    row = 3
    col = 3
        1 2 3
        3 4 5
        7 8 9
    x = 3
    o/p =location Is: 0 2, And The Element Is: 3 ,location Is: 1 0 The Element Is: 3

*/
