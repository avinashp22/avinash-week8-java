import java.util.Scanner;

public class Programme_3_FindVowelOrConsonant {

    public static void findLetter(String letter) {

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

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter any Letter: ");
        String str = scn.next().toLowerCase();

        findLetter(str);
        // closing the scanner
        scn.close();
    }
}
