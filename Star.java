public class Star {
    public static void main (String [] args ){
        int row = 5;
        int col = 5;
        // OUTER LOOP
        for (int i = 1 ; i <= row ; i++){
            // INNER LOOP
          for (int j = 1; j <= col ; j++){
              System.out.print("*");
            }
         System.out.println();
        }
    }
} 