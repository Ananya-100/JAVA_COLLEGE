

public class Prog5 {
    public static void validate(int age){
        if(age<18){
            throw new ArithmeticException("Not eligible to vote");
        }
        else{
            System.out.println("Person is eligible to vote!!"); 
        }
    }
    public static void main(String[] args) {
        validate(13);
    }
}
