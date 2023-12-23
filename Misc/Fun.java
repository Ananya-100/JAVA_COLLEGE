interface A{
    void m1();
}
abstract class B implements A{
    public abstract void m2();
}
class C extends B{
    public void m1(){
        System.out.println("m1");
    }
    public void m2(){
        System.out.println("m2");
    }

}

public class Fun {
    public static void main(String[] args) {
        C b =new C();
        b.m1();
        b.m2();
    }
}
