import java.util.Scanner;

/**
 * Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel of Consonant, depending on the user input. If the user input Is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */
public class Programme_3_FindVowelOrConsonant {

    public static void findLetter(String letter) {
//logic calculations
        if (letter.length() > 1) {
            System.out.println("Not a valid character");
        } else if (!(isLetter(letter))) {
            System.out.println("Enter uppercase or lowercase letter only");
        } else if (letter.equals("a") || letter.equals("e") || letter.equals("i")
                || letter.equals("o") || letter.equals("u")) {
            System.out.println("Letter is a vowel");
        } else {
            System.out.println("Letter is a consonant");
        }
    }


    public static boolean isLetter(String l) {
        return l.charAt(0) > 96 && l.charAt(0) < 123;
    }

    public static void main(String[] args) { //main method

        Scanner scn = new Scanner(System.in); //scanner declaration
        System.out.println("Enter any Letter: "); //print statement
        String str = scn.next().toLowerCase();

        findLetter(str);
        //scanner close
        scn.close();
    }
}
