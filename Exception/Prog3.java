class Test{
    void m(){
        System.out.println("this is m");
    }
}

public class Prog3 {
    
    public static void main(String[] args) {
        Test t = null;
        try{
           t.m();
        }
        catch(Exception e){
            System.out.println("Null pointer exception");
        }
    }
}
