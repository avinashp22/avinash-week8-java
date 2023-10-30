import java.util.Scanner;

public class Programme_1_ReadNumbersAndSum {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        Programme_1_ReadNumbersAndSum obj = new Programme_1_ReadNumbersAndSum();
        obj.maths(scn);
        scn.close();
    }

    public void maths(Scanner scn) {
        int a = 1;
        int sum = 0;

        while (a <= 10) {
            System.out.println("Enter number " + a + "in sequence to be added");
            if (scn.hasNextInt()) {
                int number = scn.nextInt();
                sum += number;
                a++;
            } else {
                System.out.println("Invalid Number. Please enter a valid number");
            }
        }
        System.out.println("Sum of the entered numbers: " + sum);

    }


}
