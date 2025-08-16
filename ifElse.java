public class ifElse {
   public static void main(String[] args) {
       String sid = "S-111";
       String sname = "Durga";
       int smarks = 100;
       String saddr = "Hyd";
       String status = "";
       if(smarks < 0 || smarks > 100){
           status = "INVALID MARKS";
       }else{
           if(smarks < 35){
               status = "FAIL";
           }else if(smarks < 50){
               status = "THIRD CLASS";
           }else if(smarks < 60){
               status = "SECOND CLASS";
           }else if(smarks < 75){
               status = "FIRST CLASS";
           }else{
               status = "DISTINCTION";
           }
       }


       System.out.println("Student Details");
       System.out.println("--------------------");
       System.out.println("Student Id      : "+sid);
       System.out.println("Student Name    : "+sname);
       System.out.println("Student Address : "+saddr);
       System.out.println("Student marks   : "+smarks);
       System.out.println("Student Status  : "+status);


   }
}

