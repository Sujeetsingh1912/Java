public class Elseifex{
    public static void main(String [] args){
        int num1 = 10;
        int num2 = 30;
        int num3 = 10;
        if (num1>= num2 && num2> num3){
            System.out.println(num1+"  is the biggest no.");
        }
        else if (num2>= num3 && num2 > num1 ){
            System.out.println(num2+"   is the biggest no.");
        }
        else if (num3 >= num1 && num3 >num2){
            System.out.println(num3+ "  is the biggest no. ");
        }
        else {
            System.out.println(num1+","+num2+ ","+num3+ "  all are equal");
        }
    }

}