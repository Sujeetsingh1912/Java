import java.util.*;
public class Condition4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        
        System.out.println("Enter No in btw 1 to 12 ; ");
        int n = sc.nextInt();

        // if (n == 1 ){
        //     System.out.println("January");
        // }
        // else if (n == 2){
        //     System.out.println("February");
        // }
        // else if (n == 3){
        //     System.out.println("March");
        // }
        // else if (n == 4){
        //  System.out.println("April");
        // }
        // else if (n == 5){
        //  System.out.println("May");
        // }
        // else if (n == 6){
        //  System.out.println("June");
        // }
        // else if (n == 7){
        //  System.out.println("July");
        // }
        // else if (n == 8){
        //  System.out.println("August");
        // }
        // else if (n == 9){
        //  System.out.println("September");
        // }
        // else if (n == 10){
        //  System.out.println("Octuber");
        // }
        // else if (n == 11){
        //  System.out.println("November");
        // }
        // else if (n == 12){
        //  System.out.println("December");
        // }
        // else{
        //     System.out.println("Invalid");
        // }

        switch (n){
            case 1: 
             System.out.println("January");
             break;
             case 2:
             System.out.println("February");
             break;
            case 3:
            System.out.println("March");
            break;
            case 4:
            System.out.println("April");
            break;
            case 5: 
            System.out.println("May");
            break;
            case 6:
            System.out.println("June");
            break;
            case 7:
            System.out.println("July");
            break;
            case 8:
            System.out.println("August");
            break;
            case 9:
            System.out.println("September");
            break;
            case 10:
            System.out.println("October");
            break;
            case 11:
            System.out.println("November");
            break;
            case 12:
            System.out.println("December");
            break;
            default:
            System.out.println("Invalid");
            break;
        }
    

    }
}
