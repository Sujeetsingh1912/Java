public class Implicit{
    public static void main( String [] args) {
        byte b = 10 ;
        int i = b ;
        System.out.println(i+"    "+b);

        // Error--->  incompatible types: possible lossy conversion from int to byte
        // int i = 10;
        // byte b = i;
        // System.out.println(i+"    "+b);


        Long l = 10L;
        float f = l ;
        System.out.println(l+"    "+f);
       
        // Error --->incompatible types:  possible lossy conversion from float to long
        // float f = 22.22f;
        // long l = f;
        // System.out.println(f+"    "+l);

        //  Error-->incompatible types: possible lossy conversion from byte to char char c = b;
        // byte b =65;
        // char c = b;
        // System.out.println(c+"    "+b);

        // Error--->possible loss of precision short s = c ;
        // char c = 'A';
        // short s = c ;
        // System.out.println(c+"   "+s);

        // ERROR-->possible loss of precision byte b = b1 + b2 ;
        //  byte b1 = 10;
        //  byte b2 = 20;
        //  byte b = b1 + b2 ;
        //  System.out.println(b);
 
        // Error--> possible loss of precisionlong l = b+f ;
        // byte b = 10;
        // float f = 1.0f;
        // long l = b+f ;
        // System.out.println(l);
 
        //   error : possible loss of precision float f = l + d;
        // long l = 10;
        // double d = 22.222;
        // float f = l + d;
        // System.out.println(f);


    

    }
}