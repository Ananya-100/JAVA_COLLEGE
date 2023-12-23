class A {
    int a = -10;
    void m1() throws Exception{
        System.out.println("this is m1");
    }
	
}
class B extends A {
    void m1()throws ArithmeticException{
        System.out.println("this is m2");
        if(a<0){
            throw new ArithmeticException();
        }
    }
	
}
public class Prog9 {
	public static void main(String[] args) throws Exception {
		A a=new A();
		a.m1();
		B b=new B();
		b.m1();
	}
}