import java.util.*;
public class ifelse2 {
    public static void main ( String []args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100){
            System.out.println("Invalid Marks");    
        }
        else if (marks >= 75 ){
            System.out.println("A grade ");
        }
        else if( marks >=60 ){
            System.out.println("B garde");
        }
        else if (marks >= 45){
            System.out.println("C grade");
        }
        else if (marks >= 33) {
            System.out.println("D grade");
        }
        else {
            System.out.println("F grade");
        }


    }
    
}
