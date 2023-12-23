abstract class A{
    void m1(){
        System.out.println("this is m1");
    }
    void m2(){
        System.out.println("this is m2");
    }
}

public class Pg2 extends A{
    public static void main(String[] args) {
        A a = new Pg2();
        a.m1();
        a.m2();
    }
    
}
