import java.util.Scanner;

public class Programme_15_LeftTriangleStar {

    public static void triangle() {
       int a = 6;
        for (int i = 1; i <=a; i++) {
            for (int k = 1; k <= a - i + 1; k++) {
                System.out.print("");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int a = scr.nextInt();
        triangle();
    }
}




