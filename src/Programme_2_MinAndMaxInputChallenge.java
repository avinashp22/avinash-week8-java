import java.util.Scanner;

/**
 * Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered
 */
public class Programme_2_MinAndMaxInputChallenge {


    public static void minAndMax() {
        Scanner scn = new Scanner(System.in); //scanner declaration
        int min = 0, max = 0;
        boolean first = true;

        while (true) {
            System.out.println("Enter Number "); //print statement
            //logic calculations
            boolean isAnint = scn.hasNextInt();
            if (isAnint) {
                int number = scn.nextInt();
                if (first) {
                    first = false;
                    min = number;
                    max = number;
                }
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            } else {
                break;
            }
            scn.nextLine();
        }
        System.out.println("Min = " + min + " , Max = " + max);//print statement
        scn.close(); //scanner close
    }

    public static void main(String[] args) {
        minAndMax();
    } //main method

}



