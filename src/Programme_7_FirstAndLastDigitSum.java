import java.util.Scanner;

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
        //Scanner declaration for reading input form console
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter 2 digit number ");
        int a = scn.nextInt();
        System.out.println("The sum of first & last digit is " + digit(a));
        // closing the scanner object
        scn.close();
    }

}
