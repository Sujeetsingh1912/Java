public class Alphabet{
    public static void main(String[] args) {
        // for(  int row = 0; row<=9 ; row++ ){
        //     for( char col = 0; col <= 9; col++) {
        //       System.out.print((char)(74-col));
        //     }
        //   System.out.println( );
        // }
        
        // OR
  
     //    for(int rows = 0; rows < 10; rows++){
     //        for(char c = 'J'; c >= 'A'; c--){
     //            System.out.print(c+" ");
     //        }
     //        System.out.println();
     //    }


      //  Next Question

      //  for (char row = 'A'; row <= 'J';row++){
      //   for (char  col ='A'; col<= row ; col++){
      //     System.out.print(row);
      //   }
      //   System.out.println();
      //  }

      //  OR 

      for (int row = 0 ; row <= 9 ; row++){
        for (int col =0 ; col <= row ; col++){
            System.out.print((char)(65+row));
        }
        System.out.println();
      }

     }

}

