class Parent{
    static{
        System.out.println("Static block of parent");
    }
    public static void m2(){
        System.out.println("this is m2 from demo class");
    }
    Parent(){
        System.out.println("Constructor of parent");
    }
}

class Child extends Parent{
    
    Child(){
        System.out.println("Constructor of child ");
    }
    public static void m1(){
        System.out.println("This is m() from child");
    }
    static{
        System.out.println("static block of child");
    }
}

public class P2 {
        public static void main(String[] args) {
            Child t = new  Child();
            t.m1();
            t.m2();
            

        }
}
