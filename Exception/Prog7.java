class userdefine1 extends Exception{
    public String getMessage(){
        return "exception2";
    }
}

class userdefine2 extends Exception{
    public String getMessage(){
        return "exception1";
    }
}
class Test{
    
    void f(){
        
        try {
            g();
        } 
        catch (userdefine1 e) {
            System.out.println(e);
            try {
				throw new userdefine2();
			} catch (userdefine2 e1) {
				System.out.println(e1);
			}

        }
    }
     

    void g()throws userdefine1{
        
        throw new userdefine1();
        
    }
        
       

}
public class Prog7 {
    public static void main(String[] args) {
        Test t = new Test();
        t.f();
    }
}
