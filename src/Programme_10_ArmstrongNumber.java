import java.util.Scanner;

public class Programme_10_ArmstrongNumber {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); // scanner creation to read a data
        System.out.println("Enter a number "); //Printing a statement
        int number = scn.nextInt(); // going to the next line
        scn.close(); // scanner close
        Programme_10_ArmstrongNumber obj = new Programme_10_ArmstrongNumber(); // calling instance method via object
        obj.armstrong(number);
    }

    public void armstrong(int number) {
        //Initialize a variable
        int originalNumber = number;
        int numberOfDigits = String.valueOf(number).length(); // return the length of the String representation of the number
        int sum = 0;

        while (number > 0) { // While loop
            int digit = number % 10;
            sum += Math.pow(digit, numberOfDigits); //Method used to calculate Armstrong number
            number /= 10;

        }
        // check and printing a statement for armstrong number or not
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong Number");
        } else {
            System.out.println(originalNumber + " is not an Armstrong Number");
        }

    }

}
