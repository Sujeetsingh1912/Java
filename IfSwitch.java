public class IfSwitch {
    public static void main (String[] args){
       int button = 3;
   
    //   if ( button == 1 ){
    //   System.out.println("hello");
    //   }
    //   else if (button==2) {
    //    System.out.println("Namaste");
    //   }
    //   else if (button==3) {
    //    System.out.println("banjour");
    //   }
    //   else {
    //    System.out.println("INVALID");

    //   }
    switch (button) {
      case 1 :  System.out.println("hello");
      break ;
      case 2 :  System.out.println("banjour");
      break ;
      case 3 :  System.out.println("Namaste");
      break ;
     default :  System.out.println("invalid");
      
    }

    }
}