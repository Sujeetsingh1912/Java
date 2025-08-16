import java.util.*;
public class Condition9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age : ");
        int age = sc.nextInt();

        if (age < 0 ){
            System.out.println("Invalid age, Age cannot be negative ");
        }       
        else if (age >= 18 ){
            System.out.println("You are eligible for vote ");
        }
        else {
            System.out.println("You are not eligible for vote ");
        }
    }
}
