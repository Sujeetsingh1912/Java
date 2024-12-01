public class Switchcharboo{
    public static void main(String []args){

     char c = 'B';
      switch (c){
        case 'A' : {
            System.out.println("AAA");
            break;
        }
        case 'B' : {
            System.out.println("BBB");
            break;
        }
        case 'C' : {
            System.out.println("CCC");
            break;
        }
        case 'D' : {
            System.out.println("DDD");
            break;
        }
        case 'E' : {
            System.out.println("EEE");
            break;
        }
        default:{
            System.out.println("INVALID CHARACTER");
        }
      } 

    
     //  ERROR---> incompatible types ^ switch (b){ required: int found:    boolean
     
     //   boolean b = true;
     //   switch (b){
     //     case true : {
     //         System.out.println("TRUE");
     //         break;
     //     }
     //     case false : {
     //         System.out.println("FALSE");
     //         break;
     //     }
     //     default : {
     //         System.out.println("INVALID");
     //         break;
     //     }
     //   }




    }
}
