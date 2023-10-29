import java.util.Scanner;

public class Programme_14_DiamondPattern {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter N : ");
            int n = sc.nextInt();
            System.out.print("Enter Symbol : ");
            char c = sc.next().charAt(0);
            int i = 1;
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
