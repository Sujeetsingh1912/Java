public class Forloop{
    public static void main(String []args){
        // for (int i=0 ; i< 10 ; i++){
        //  System.out.println(i);
        // }
        for (int num =1; num <= 100; num++){
            if(num%2 ==0){
            System.out.println(num+"  is EVEN Number");
            }
            else{
            System.out.println(num+"  is ODD Number");
            }
        }
    }
}