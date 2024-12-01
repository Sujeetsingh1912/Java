public class Switchconstant {
    public static void main (String [] args){
       
    //    Switchconstant.java:5: error: constant expression required
    //        case i:
    //             ^
    //    Switchconstant.java:8: error: constant expression required
    //        case j:
    //             ^
    //    Switchconstant.java:11: error: constant expression required
    //        case k:
    //             ^
    //    Switchconstant.java:14: error: constant expression required
    //        case l:
    //             ^
    //     4 ERROR ------->
       
    //     int i = 5, j = 10, k = 15, l= 20;
    //       switch (10) {
    //        case i:
    //            System.out.println("FIVE");
    //            break;
    //        case j:
    //            System.out.println("TEN");
    //            break;
    //        case k:
    //            System.out.println("FIFTEEN");
    //            break;
    //        case l:
    //            System.out.println("TWENTY");
    //            break;
          
    //        default:
    //            System.out.println("Default");
    //            break;
    //    }

          

              final int i = 5, j = 10, k = 15, l= 20;
       switch (15) {
           case i:
               System.out.println("FIVE");
               break;
           case j:
               System.out.println("TEN");
               break;
           case k:
               System.out.println("FIFTEEN");
               break;
           case l:
               System.out.println("TWENTY");
               break;
          
           default:
               System.out.println("Default");
               break;
          
       }

    }
}