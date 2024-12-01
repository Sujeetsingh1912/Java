class A{
    A(float f){
        // this(10);
        System.out.println("A-Con");
    }
    A(){
        this(22.22f);
        System.out.println("A-int-param-con");
    }
    A(int i){
        // this(33.3333);
        System.out.println("A-float-param-con");
    }
    A(double d){
        System.out.println("A-double-param-con");
    }
 }
 class Test {
     public static void main(String[] args) {
        A a = new A();      
     }
 }
 