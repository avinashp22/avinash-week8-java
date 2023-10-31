import java.util.Scanner;

/**
 * Read 10 numbers from the console entered by the user and print the sum of those numbers.
 */

public class Programme_1_ReadNumbersAndSum {

    public static void main(String[] args) { //main method

        Scanner scn = new Scanner(System.in); //scanner declaration
        System.out.println("Enter 10 numbers"); //print statement
        Programme_1_ReadNumbersAndSum obj = new Programme_1_ReadNumbersAndSum();//object creation
        obj.maths(scn);
        scn.close(); //scanner close
    }

    public void maths(Scanner scn) {
        int a = 1;
        int sum = 0;

        while (a <= 10) {
            System.out.println("Enter number " + a + " in sequence to be added"); //print statement
            //logic calculations
            if (scn.hasNextInt()) {
                int number = scn.nextInt();
                sum += number;
                a++;
            } else {
                System.out.println("Invalid Number. Please enter a valid number"); //print statement
            }
        }
        System.out.println("Sum of the entered numbers: " + sum); //print statement

    }

}
