class Outer{
    private int x =10;
    void m(){
        System.out.println("Outer class method");
        class Inner{
            void n(){
                System.out.println("This is x "+x);
            }
        }
        Inner i = new Inner();
        i.n();
    }
}


public class P4 {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.m();
    }
    
}
