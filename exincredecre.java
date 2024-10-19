public class exinredecre
{
   public static void main(String[] args) 
   {

      int a = 7;
      System.out.println(++a - ++a);
      
      int b = 8;
      System.out.println(b++-b++);

      int c = 7;
      System.out.println(--c+c++-++c);

      int d = 6;
      System.out.println(--d+d--*++d-++d);
    
      int e = 5;
      System.out.println(--e*--e+e++*--e);

       int f = 6;
      System.out.println((--f+--f)+(++f-++f)*(++f-f--)-(--f+f++));

   }   
}
