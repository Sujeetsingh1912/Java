public class Ifelseex{
    public static void main (String [] args){
        String customerId = "sujeet999";
        String customername = "Sujeet singh";
        String customerAddress ="hyderabad";
        long annualIncome = 55764300l;
        int taxPay = 0;
        
        if (annualIncome < 0 ){
            System.out.println("INVALID annualIncome");
        }
        else {
            if (annualIncome < 500000){
               taxPay =0;
            }
            else if (annualIncome < 1000000){
               taxPay = (int) (annualIncome * 5/100);
            }
            else if (annualIncome < 5000000){
               taxPay = (int) (annualIncome * 10/100);
            }
            else if (annualIncome < 10000000){
                taxPay = (int) (annualIncome * 15/100);
            }
            else if (annualIncome < 100000000){
                taxPay = (int) (annualIncome * 20/100);
            }
            else if (annualIncome < 500000000){
               taxPay = (int) (annualIncome * 25/100);
            }
            else {
              taxPay = (int) (annualIncome * 30/100);
            }
        }
       System.out.println("Cutomer   details  ");
       System.out.println("------------------- ");
       System.out.println("Cutomer  Id            : "+customerId);
       System.out.println("Cutomer  name          : "+customername);
       System.out.println("Cutomer   add          : "+customerAddress);
       System.out.println("Cutomer  annualincome  : "+annualIncome);
       System.out.println("Cutomer  taxpay        : "+taxPay);

    }
}