package java_pro.Array_2d;

import java.util.Scanner;

public class MaxElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int maxElement = Integer.MIN_VALUE;

        int[][] numbers = new int[row][col];
        int[][] a = {
                {1,2,3,4},
                {5,6,7,8},
                {7,5,1,9}};

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (numbers[i][j] > maxElement) {
                    maxElement = numbers[i][j];
                }
            }
        }
        System.out.print(maxElement);
    }

}
