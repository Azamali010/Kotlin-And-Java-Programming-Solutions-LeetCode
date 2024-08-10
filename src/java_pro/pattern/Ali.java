package java_pro.pattern;

public class Ali {
    public static void main(String[] args) {
        printLetter('A');
        System.out.println();
        printLetter('L');
        System.out.println();
        printLetter('I');
    }

    public static void printLetter(char letter) {
        int height = 7; // Height of the letters
        int width = (2 * height) - 1; // Width for 'A', height for 'L' and 'I'

        if (letter == 'A') {
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
        } else if (letter == 'L') {
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < height; j++) {
                    if (j == 0 || i == height - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } else if (letter == 'I') {
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < height; j++) {
                    if (i == 0 || i == height - 1 || j == height / 2) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
