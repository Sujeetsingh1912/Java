import java.util.*;
public class Ifelse3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your digit: ");
        int num = sc.nextInt();

        if (num <= 1 && num >= 100 ){
            System.out.println(num + " is in range 1 to 100 ");
        }
        else {
            System.out.println(num + " is not in range 1 to 100 ");
        }

    
}
}
