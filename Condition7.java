import java.util.*;
public class Condition7 {
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter a year : ");
     int year = sc.nextInt();

     if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
          System.out.println("Leap Year");
     }
        else{
          System.out.println("Not Leap Year");
        }

   }
}
