import java.util.*;
public class Condition5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first number: ");
        int a = sc.nextInt(); 
        System.out.println("Enter Second number: ");
        int b = sc.nextInt(); 
        System.out.println("Enter Third number: ");
        int c = sc.nextInt(); 

        // if (a > b){
        //     System.out.println(a+ " is greater than "+ b + " and " +c);
        // }
        // else if (b > c){
        //     System.out.println(b +" is greater than "+ c+ " and "+ a);
        // }
        // else if(c > a ) {
        //     System.out.println(c +" is greater than "+ b +" and " + a);
        // }
        // else if (b > a){
        // System.out.println(b +" is greater than "+ a + " and " + c);
        // }
        // else if (a > c){
        //     System.out.println(a +" is greater than "+ c + " and "+ b);
        // }
        // else if (c > b){
        //     System.out.println(c +" is greater than "+ b + " and " + a);
        // }
        // else{
        //     System.out.println( "All numbers are equal");
        // }

             if (a == b && b == c) {
              System.out.println("All numbers are equal.");
            } else if (a >= b && a >= c) {
               System.out.println(a + " is the greatest.");
              } else if (b >= a && b >= c) {
            System.out.println(b + " is the greatest.");
            } else {
              System.out.println(c + " is the greatest.");
            }

    }
}


