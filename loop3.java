import java.util.*;
public class loop3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number whose table you want : ");
        int n = sc.nextInt();
            // For loop
        // for(int i = 1; i<11; i++){
        //     System.out.println(i*n);
        // }

        // while loop
        // int i = 1 ;
        // while(i<11){
        //     System.out.println(i*n);
        //     i++;
        // }

        // do-while loop 
        int i = 1;
        do{
            System.out.println(i*n);
            i++;
        }while (i<11);
     }
}
