/**
 * Prog1
 */
public class Prog1 {
    public static void main(String[] args) {
        
        try{
            int a = 3;
            int b = 4;
            System.out.println(a/(b-b));
        }
        catch(ArithmeticException e){
            System.out.println("Can;t divide by zero");
        }
        System.out.println("rest of the code");
    }
    
}