import java.util.Scanner;

public class Programme_2_MinAndMaxInputChallenge {


    public static void minAndMax() {
        Scanner scn = new Scanner(System.in);
        int min = 0, max = 0;
        boolean first = true;

        while (true) {
            System.out.println("Enter Number ");
            boolean isAnint = scn.hasNextInt();
            if (isAnint) {
                int number = scn.nextInt();
                if (first) {
                    first = false;
                    min = number;
                    max = number;
                }
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            } else {
                break;
            }
            scn.nextLine();
        }
        System.out.println("Min = " + min + " , Max = " + max);
        scn.close();
    }

    public static void main(String[] args) {
        minAndMax();
    }
}



