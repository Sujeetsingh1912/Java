public class Smalltriangle {
    public static void main(String[] args) {

        //  ODD NO
        for (int row=0 ; row< 5 ; row++){
            for (int spaces=0; spaces <4- row; spaces++){
                System.out.print(" ");
            }
            for(int star= 0 ; star <2*row+1; star++){
                System.out.print("*");
            }
            System.out.println();
        }

        //  EVEN NO 

        for(int row=0; row<5 ; row ++){
            for (int spaces=0 ;spaces< 4- row; spaces++){
                System.out.print(" ");
            }
            for (int star =0 ; star< 2*row +2; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
