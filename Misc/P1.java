class Demo{
    public static void m2(){
        System.out.println("this is m2 from demo class");
    }
}

class Test extends Demo{
    static{
        System.out.println("This is Static block");
    }
    public static void m1(){
        System.out.println("This is m()");
    }
    public static void n(){
        System.out.println("This is n()");
    }
}

class P1{
    public static void main(String[] args) {
        Test t = new Test();
        t.m1();
        t.n();
        t.m2();
        
    }
}