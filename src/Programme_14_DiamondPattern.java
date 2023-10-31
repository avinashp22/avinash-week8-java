import java.util.Scanner;

/**
 * Write a program in Java to display the pattern like a diamond.
 * While loop
 * *
 * ***
 * *****
 * *******
 * *********
 * ***********
 * *************
 * ***********
 * *********
 * *******
 * *****
 * ***
 * *
 */
public class Programme_14_DiamondPattern {

        public static void main(String[] args) { //main method
            Scanner scn = new Scanner(System.in); //scanner declaration
            System.out.println("Enter Number of rows : "); //print statement
            int n = scn.nextInt();
            System.out.print("Enter Symbol : "); //print statement
            char c = scn.next().charAt(0);
            //logic calculations
            int i = 1;
            scn.close(); //scanner close
            while (i <= n) {
                int j = 1;
                while (j <= n - i) {
                    System.out.print(" ");
                    j++;
                }
                j = 1;
                while (j <= i * 2 - 1) {
                    System.out.print(c);
                    j++;
                }
                System.out.println();
                i++;
            }
            i = n - 1;
            while (i > 0) {
                int j = 1;
                while (j <= n - i) {
                    System.out.print(" ");
                    j++;
                }
                j = 1;
                while (j <= i * 2 - 1) {
                    System.out.print(c);
                    j++;
                }
                System.out.println();
                i--;
            }
        }
    }
