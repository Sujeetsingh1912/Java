public class Testa {


   public static void main(String[] args) {
      
       int a = 10;
       int b = 10;


       if(a++ == 10 | b++ == 10){
           System.out.println(a+"     "+b);// 11  11
       }


       int c = 10;
       int d = 10;


      if(c++ == 10 || d++ == 10){
           System.out.println(c+"    "+d);// 11   10  
       }


   }
}
