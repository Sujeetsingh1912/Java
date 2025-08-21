public class Biggestno {
    public static void main (String [] args){
        int x = 110;
        int y = 225;
        int z = 80;
        int big   = x > y?(x > z? x : z): (y > z? y : z);
        int small = x < y?(x < z? x : z ): (y < z? y : z);

        System.out.println("biggest no  :  "+big);
        System.out.println("smallest no  :  "+small);
    }

}










