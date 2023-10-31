import java.util.Scanner;

/**
 * Write a method named sumFirstAndLastDigit with one parameter of type int called number.
 * The method needs to find the first and the last digit of the parameter number passed to the method, using a loop and return the sum of the first and the last digit of that number.
 * If the number is negative then the method needs to return -1 to indicate an invalid value.
 */
public class Programme_7_FirstAndLastDigitSum {

    public static int digit (int number) {
        if (number < 0) {return -1;}

        int r, rev = 0, fd, ld, s;
        ld = number % 10;
        while (number > 0) {
            r = number % 10;
            rev = rev * 10 + r;
            number = number / 10;
        }
        fd = rev % 10;  // swap the 2 digits around
        s = fd + ld;   //adding the 2 digits
        return s;
    }

    public static void main(String[] args) {
        //Scanner declaration
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter 2 digit number ");
        int a = scn.nextInt();
        System.out.println("The sum of first & last digit is " + digit(a));
        //scanner close
        scn.close();
    }

}
