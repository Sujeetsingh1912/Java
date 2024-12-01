public class Reversetriangle {
    public static void main(String[] args) {

    //     for (int rows = 0; rows<=9; rows++){
    //         for (int stars = 0 ; stars <(10- rows); stars++){
    //     System.out.print("*");
    //     }
    //     System.out.println();
    // }

    // correct triangle

    //   for (int rows = 0 ; rows<=9 ; rows++){
    //     for (int stars = 0 ; stars < (9-rows); stars++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    //   }

    //  Spaces value
      for (int rows = 0;rows<10; rows++){
         for (int Spaces= 0 ; Spaces< rows;Spaces++){
              System.out.print(" ");
           }
         for(int stars=0 ; stars<(10-rows);stars++){
             System.out.print("*");
             }
      System.out.println();
     } 
}
}
