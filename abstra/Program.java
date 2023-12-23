abstract class Demo{
    int x;
    Demo(int x){
        this.x = x;
    }
    abstract void m1();
    void m2(){
        System.out.println("this is m2");
        System.out.println(x);
    }
}
class Demo1 extends Demo{
    Demo1(int x){
        super(x);
    }
    public void m1(){
        System.out.println("this is abstract method");
    }
}
class Program{
    public static void main(String[] args) {
        Demo1 d = new Demo1(5);
        d.m2();
        d.m1();
        
    }
}