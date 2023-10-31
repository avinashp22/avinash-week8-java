import java.util.Scanner;

/**
 * Display right angle triangle of @ using nested for loops
 *
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */
public class Programme_8_SymbolTriangle {


    public static void triangle(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("@");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        //Scanner declaration
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number of rows ");
        triangle(scn.nextInt());
        // closing scanner
        scn.close();
    }

}
