import java.util.Scanner;

/**
 * Display left angle triangle of * using nested for loops
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 */
public class Programme_15_LeftTriangleStar {
    //logic calculations
    public static void triangle() {
        int a = 6;
        for (int i = 1; i <= a; i++) {
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
        Scanner scn = new Scanner(System.in); //scanner declaration
        System.out.print("Enter the number of rows: "); //print statement
        int a = scn.nextInt();
        scn.close();//scanner close
        triangle(); // calling static method
    }
}




