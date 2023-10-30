import java.util.Scanner;

public class Programme_6_NumberTriangle {

    public static void triangle(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++)
            {
                System.out.print( j + 1 );
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number of rows");
        //calls static method
        triangle(scn.nextInt());
        //closing the scanner object
        scn.close();
    }

}
