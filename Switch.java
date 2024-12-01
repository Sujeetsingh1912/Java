public class Switch {
    public static void main(String [] args){
       int DayNo = 6;
       switch (DayNo){
        case 1 : {
         System.out.println("MONDAY");
         break;
        }
        case 2 :{
         System.out.println("TUESDAY");     
         break;
        } 
        case 3 :{
         System.out.println("WEDNESDAY");     
         break;
        } 
        case 4 :{
         System.out.println("THRUSDAY");     
         break;
        } 
        case 5 :{
         System.out.println("FRIDAY");     
         break;
        } 
        case 6 :{
         System.out.println("SATURDAY");     
         break;
        }
        case 7 :{
         System.out.println("SUNDAY");     
         break;
        }
        default:{
          System.out.println("INVALID WEEKDAYS");     
        }
       }

     //ERROR---->possible loss of precision   switch (l) required: int   found:    long
   
     //  long l = 7;
     //  switch (l){
     //     case 1 : 
     //     System.out.println("ONE");
     //     break;
     //     case 2 : 
     //     System.out.println("TWO");
     //     break;
     //     case 3 : 
     //     System.out.println("THREE");
     //     break;
     //     case 4 : 
     //     System.out.println("FOUR");
     //     break;
     //     case 5 : 
     //     System.out.println("FIVE");
     //     break;
     //     case 6 : 
     //     System.out.println("SIX");
     //     break;
     //     case 7 : 
     //     System.out.println("SEVEN");
     //     break;
     //     case 8 : 
     //     System.out.println("EIGHT");
     //     break;
     //     case 9 : 
     //     System.out.println("NINE");
     //     break;
     //     case 10 : 
     //     System.out.println("TEN");
     //     break;
     //     default:
     //     System.out.println("INVALID NO.")
     // }
           


    
        }

    }