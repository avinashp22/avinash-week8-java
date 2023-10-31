import java.util.Scanner;

/**
 * Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */
public class Programme_10_ArmstrongNumber {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); //scanner declaration
        System.out.println("Enter a number "); //print statement
        int number = scn.nextInt();
        scn.close(); //scanner close
        Programme_10_ArmstrongNumber obj = new Programme_10_ArmstrongNumber(); // calling instance method
        obj.armstrong(number);
    }

    public void armstrong(int number) {

        int originalNumber = number;
        int numberOfDigits = String.valueOf(number).length();
        int sum = 0;
        //logic calculations
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numberOfDigits);
            number /= 10;

        }
        //print statements
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong Number");
        } else {
            System.out.println(originalNumber + " is not an Armstrong Number");
        }

    }

}
