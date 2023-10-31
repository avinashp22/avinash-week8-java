import java.util.Scanner;

/**
 * Write a programme to input any number and check if it is prime or not.
 */
public class Programme_12_PrimeNumber {

    //logic calculations
    public static void isPrimeNumber(int num) {
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(num + " is a prime number"); //print statement
        else
            System.out.println(num + " is not a prime number"); //print statement
    }

    public static void main(String[] args) { //main method
        //Scanner declaration
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter any number: "); //print statement
        int a = scn.nextInt();
        isPrimeNumber(a);
        //scanner close
        scn.close();
    }


}
