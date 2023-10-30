import java.util.Scanner;

public class Programme_11_EvenDigitSum {

    public static int digitSum(int number) {
        if (number < 0) {
            System.out.println("Invalid input");
            return -1; // return -1 for entering a negative numbers
        }
        int evenDigitSum = 0; // initialize the sum of even digits
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

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number ");
        int number = scn.nextInt();
        digitSum(number);
        scn.close();
    }
}
