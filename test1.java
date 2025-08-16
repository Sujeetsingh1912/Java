class A{
    A(){
        System.out.println("A-con");
    }
    A(int i ){
        System.out.println("A-int-param-con");
    }
    A (float f){
        System.out.println("A-float-param-con");
    }
    A (double b ){
        System.out.println("A-double-param-con");
    }

}

public class test1 {
      public static void main(String[] args) {
        A a = new A();

}

}
