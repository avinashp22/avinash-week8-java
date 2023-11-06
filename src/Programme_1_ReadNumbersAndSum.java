import java.util.Scanner;

/**
 * Read 10 numbers from the console entered by the user and print the sum of those numbers.
 */

public class Programme_1_ReadNumbersAndSum {

    public static void main(String[] args) { //main method
        Programme_1_ReadNumbersAndSum obj = new Programme_1_ReadNumbersAndSum();//object creation
        obj.maths();
    }

    public void maths() {
        //Scanner declaration
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        while (true) {
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
                if (counter == 10) {
                    break;
                }
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine(); // handle end of line (enter key)
        }
        System.out.println("sum = " + sum);
        // closing the scanner
        scanner.close();
    }


}
