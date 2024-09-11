public class Test {
 
   public static void main(String[] args)
   {
 String sID = "634653";
 String sName = "sujeet";
 String sAdd = "hyd";
 int sMarks = 35;
 String status ="";
 if ( sMarks < 0 || sMarks > 100)
 {
  status = "invalid Marks";
 } 
 else{
  if(sMarks < 35)
 {
  status ="fail";
 }
  else if (sMarks < 50)
 {
 status = "third class";
  }
  else if ( sMarks < 60)
  {
 status = "second class";
 } 
 else if ( sMarks < 70)
 {
 status = "first class"; 
 }
  else 
  {
  status = "distintion";
  }
 }
 
 System.out.println("STUDENT DETAILS");
 System.out.println("------------------------");
 System.out.println("Student ID      :  "+sID);
 System.out.println("Student Name    :  "+sName);
 System.out.println("Student Address :  "+sAdd);
 System.out.println("Student Marks   :  "+sMarks);
 System.out.println("Student Status  :  "+status);
   
}
}