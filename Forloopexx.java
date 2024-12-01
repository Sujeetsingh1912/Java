public class Forloopexx {
    public static void main (String [] args){
        // int num = 8;
        // int count =0;
        // for ( int i = 1; i <=num ; i++ ){
        //   if (num%i==0){
        //     count = count + 1;
        //   }
        // }  
        // if (count==2){
        //     System.out.println(num+ " is a PRIME NO.");
        //   }
        //   else{
        //     System.out.println(num+" is a NOT PRIME NO.");
        //   } 
        

        for (int num =1 ; num<=100; num++){
            int count = 0;
            for (int i=1; i<= num ; i ++){
                if (num%i==0){
                    count = count+1;
                }
            }
            if (count==2){
                System.out.println(num+ " is a PRIME NO.");
            }
            else{
                System.out.println(num+" is a NOT PRIME NO.");
            }
        }

    }
}