class Outer{
    private int x =20;
    class Inner{
        void m(){
            System.out.println("this is inner class  method");
            System.out.println(x);
        }

    }
    void m2(){
    Inner i = new Inner();
        i.m();
    }
}
public class P3 {
    public static void main(String[] args) {
        Outer o =new Outer();
        o.m2();
        
       
    }  
}
