public class Explicit{
    public static void main (String[]args){

        //    int i = 10;
        //    byte b = (byte) i ;
        //    System.out.println(i+"     "+b);

        // int i = 10;
        // short s = (short) i ;
        // System.out.println(i+"   "+s);

        float f = 10.0f;
        long l = (long) f ;
        System.out.println(l+"   "+f);

        // byte b = 65;
        // char c = (char) b;
        // System.out.println(b+"    "+c);

        char c = 'A';
        short s = (byte) c;
        System.out.println(c+"    "+s);

        // byte b1 = 10;
        // byte b2 = 10;
        // byte b = (byte) (b1+b2);
        // System.out.println(b);

        double d = 22.345;
        byte b = (byte)(short)(int)(long)(float) d;
        System.out.println(b);

        







    }
}