public class Puredoubletriangle {
    public static void main(String[] args) {

        //  ODD NO 
        for(int row =0; row< 10; row++ ){
            for (int spaces =0; spaces< 9-row;  spaces++ ){
                System.out.print(" ");
            }
            for(int star=0 ;  star< row+1; star++ ){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int row=0 ; row < 9; row++){
            for(int spaces=0 ; spaces<=row; spaces++){
                System.out.print(" ");
            }
            for(int star=0 ; star<9-row; star++){
                System.out.print("*"+" ");
        }
        System.out.println();
    }

    // EVEN NO

    for (int row = 0; row<5 ; row++){
        for (int spaces = 0; spaces< 4-row;  spaces++ ){
            System.out.print(" ");
        }
        for(int star=0 ;  star< row+1; star++ ){
            System.out.print(" "+"*");
        }
        System.out.println();
    }
}
}
