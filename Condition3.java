import java.util.*;
public class Condition3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("enter your first digit : ");
        double a = sc.nextInt();

        System.out.println("enter your second digit : ");
        double b = sc.nextInt();


        System.out.println("Choose an operation:");
        System.out.println("1: Addition (+)");
        System.out.println("2: Subtraction (-)");
        System.out.println("3: Multiplication (*)");
        System.out.println("4: Division (/)");
        System.out.println("5: Modulo (%)");

        int choice = sc.nextInt();
        double result;

        // if (choice == 1 ){
        //     result = a + b;
        //     System.out.println("Result : " + result);
        // }
        // else if (choice == 2){
        //     result= a-b;
        //     System.out.println("Result: " +result);
        // }
        // else if (choice == 3){
        //     result= a*b;
        //     System.out.println("Result: " +result);
        // }
        // else if (choice == 4){
        //     result = a/b;
        //     System.out.println("Result: " +result);
        // }
        // else if (choice == 5){
        //     result= a%b;
        //     System.out.println("Result: " +result);
        // }
        // else{
        //     System.out.println("Invalid choice");
        // }

        switch (choice) {
            case 1: result = a + b;
            System.out.println("Result :" + result);
                break;

                case 2: result = a - b;
            System.out.println("Result :" + result);
                break;
                case 3: result = a * b;
            System.out.println("Result :" + result);
                break;
                case 4: result = a / b;
            System.out.println("Result :" + result);
                break;
                case 5: result = a % b;
            System.out.println("Result :" + result);
                break;
        
            default:
            System.out.println("Invalid choice");
                break;
        }

        
        sc.close();
        
    }
    

}
