class Employee{
  
   int eno = 111;
   String ename = "SUJEET";
   float  esal = 750000.0f;
   String eemailId = "sujeet123@.com";
   String emobileNo = "91-9988776655";
   String eaddr = "MP";


   public void displayEmpDetails(){
       System.out.println("Employee Details");
       System.out.println("-------------------------");
       System.out.println("Employee Number     : "+eno);
       System.out.println("Employee Name       : "+ename);
       System.out.println("Employee Salary     : "+esal);
       System.out.println("Employee Email Id   : "+eemailId);
       System.out.println("Employee Mobile No  : "+emobileNo);
       System.out.println("Employee Address    : "+eaddr);
      
   

   }

}
