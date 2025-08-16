import java.util.*;

public class Condition6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char c = sc.next().charAt(0); // Read input character
        char ch = Character.toLowerCase(c);

        if (!Character.isLetter(ch)) {
            System.out.println("Invalid input: Not a letter");
            } else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
             System.out.println("Vowel");
            } else {
             System.out.println("Consonant");
        }

    }
}
