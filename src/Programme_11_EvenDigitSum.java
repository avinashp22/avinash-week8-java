import java.util.Scanner;

/**
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.
 * EXAMPLE INPUT/OUTPUT:
 * * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
 * * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
 * * getEvenDigitSum(-22); → should return -1 since the number is negative
 * NOTE: The method getEvenDigitSum should be defined as public static
 */
public class Programme_11_EvenDigitSum {

    public static int digitSum(int number) {
        if (number < 0) {
            System.out.println("Invalid input");
            return -1; // return -1 for entering a negative numbers
        }
        int evenDigitSum = 0;
        //While loop
        while (number > 0) {
            int value = number % 10; // get the last digit number
            if (value % 2 == 0) {
                evenDigitSum += value; // add even digits to the sum
            }
            number /= 10; // remove last digit
        }
        System.out.println("Sum of even numbers " + evenDigitSum); // print statement
        return evenDigitSum; // return the sum of even digit
    }

    public static void main(String[] args) { //main method
        Scanner scn = new Scanner(System.in); //scanner declaration
        System.out.println("Enter number "); //print statement
        int number = scn.nextInt();
        digitSum(number);
        scn.close(); //scanner close
    }
}
