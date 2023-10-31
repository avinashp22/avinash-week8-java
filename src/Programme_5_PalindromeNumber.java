import java.util.Scanner;

/**
 * Write a method called isPalindrome with one int parameter called number.
 * The method needs to return a boolean.
 * It should return true if the number is a palindrome number otherwise it should return false. Check the tips below for more info about palindromes.
 * Example Input/Output
 * isPalindrome(-1221); → should return true
 * isPalindrome(707); → should return true
 * isPalindrome(11212); → should return false because the reverse is 21211 and that is not equal to 11212.
 */
public class Programme_5_PalindromeNumber {

    public static boolean palindrome(int number) {
        //converts negative number to positive number
        if (number < 0) {
            number = -number;
        }
        int lastDigit, reverse = 0, temp;
        temp = number;
        while (number > 0) { //Stores the last digit
            lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;
        }
        return reverse == temp;
    }

    public static void main(String[] args) {
        //Scanner declaration
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int a = scn.nextInt();
        boolean check = palindrome(a);
        //checks number is Palindrome or not
        if (check)
            System.out.println("Number is Palindrome No ");
        else System.out.println("Number is not a Palindrome No ");
        //scanner close
        scn.close();
    }

}
