interface A{
    void m1();
    void m2();
}
interface B{
    void m3();
    void m4();
}
interface C extends A,B{
    void m5();
}
class P{
    public void m5(){
        System.out.println("P class");
    }

}
class D extends P implements C{
     public  void m1(){
        System.out.println("m1 method");
    }
    public  void m2(){
        System.out.println("m2 method");
    }
    public  void m3(){
        System.out.println("m3 method");
    }
    public void m4(){
        System.out.println("m4 method");
    }
}
public class Pg2 {
    public static void main(String[] args) {
        D d  = new D();
        d.m1();
        d.m2();
        d.m3();
        d.m4();
        d.m5();
    }
    
}
