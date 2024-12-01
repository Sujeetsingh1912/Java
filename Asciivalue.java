public class Asciivalue{
    public static void main (String [ ] args){
        // for ( int rows = 1;  rows <= 5; rows++){
        //     for (  int col = 1; col <= rows; col++){
        //         System.out.print ( (char) (col + 64) );
        //     }
        //     System.out.println();
        // }
      
         // OR
       

         for (int  rows = 1; rows <= 5; rows++){
            for(char  col = 'A'; col <= 'J'; col++){
               System.out.print(col);
            }
            System.out.println();
         }

    }
}