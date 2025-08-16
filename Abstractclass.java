 abstract class A{
       void m1(){
       System.out.println("m1-A");

       }
       abstract void m2 ();
       abstract void m3 ();
    }
       class B extends A {
     void m2(){
        System.out.println("m2-B");
     }
     void m3 (){
        System.out.println("m3-B");
     }
   } 

 public class Abstractclass  {
  public static void main (String[] args){
    // A a = new A();  ---> Error
    A a = new B ();
    a.m1();
    a.m2();
    a.m3();

    B b = new B();
     b.m1();
     b.m2();
     b.m3();

  }
 }


 