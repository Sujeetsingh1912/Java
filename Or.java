public class Or {
    public static void main (String [] args){
        int a = 10;
        int b = 14;
        
        if (a++ == 10 | b-- == 14){
            System.out.println(a+ "    "+b);
        }

        int c = 16 ;
        int d = 20 ;
        if (c-- == 16 || d++ == 20){  // double OP'||'
            System.out.println(c+ "    "+d);
        }
    }
}