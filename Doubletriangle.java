public class Doubletriangle {
    public static void main(String[] args) {
        for(int rows= 0 ; rows<=9 ; rows++){
            for (int star = 0 ; star< rows ; star++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int rows= 0; rows <= 8; rows++ ){
            for (int star = 0 ; star< (8-rows); star++){ 
              System.out.print("*");
            }
            System.out.println();
        }

    //      or 
               
                for(int rows = 0; rows < 19; rows++){
                    if(rows < 10){
                        for(int stars = 0; stars <= rows; stars++){
                            System.out.print("*");
                        }
                    }else{
                        for(int stars = 0; stars < 19-rows; stars++){
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                }
           

    }

}
