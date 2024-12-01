public class Oppositenumber {
    public static void main(String[] args) {
        // for(int row = 9 ; row >= 0 ; row--){
        //     for (int col= 0 ; col<= (9-row) ; col++ ){
        //         System.out.print(row);
        //     }
        //     System.out.println();
        // }

        for (int row = 0 ; row<=9 ; row++ ){
            for (int col = 0 ; col <= row ; col++){
                System.out.print(9-row);
            }
            System.out.println();
        }
    }
}
