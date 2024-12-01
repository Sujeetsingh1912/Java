public class Reverseoddeven {
    public static void main(String[] args) {
        for (int row = 0 ; row< 5  ; row++) {
            for (int spaces = 0 ; spaces < row ; spaces++) {
                System.out.print(" ");
            }
            for(int star=0 ; star < 10- 2*row ; star++){
                System.out.print("*");
            }
          System.out.println();
        }
    }
}
