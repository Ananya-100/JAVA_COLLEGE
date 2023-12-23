class Test{
    void  addition(){
        int x = 10;
        int y = 20;
        System.out.println(x+y);
    }
    void addition(int a, int b){
        System.out.println(a+b);
    }
    void addition(double x, double y){
            System.out.println(x+y);
    }
}
class Prog1{
    public static void main(String[] args) {
        Test t = new Test();
        t.addition();
        t.addition(1,4);
        t.addition(6.7, 2.4);
    }
}