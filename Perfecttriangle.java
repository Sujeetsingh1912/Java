public class Perfecttriangle {
    public static void main(String[] args) {
        for (int row =0; row <= 9 ; row++ ){
            for (int spaces =0 ; spaces< 9 - row; spaces++){
                System.out.print(" ");
            }
            for( int star=0 ; star<= row ; star++){
                System.out.print("*"+" ");
            }

            System.out.println();

        }

    }
}
