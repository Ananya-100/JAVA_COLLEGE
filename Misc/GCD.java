public class GCD{
    public static void main(String[] args) {
        int a = 10,b=20;
        while (a!=b) {
            if(a>b)
                a=a-b;
            else
                b=b-a;
        }
        System.out.println("Gcd is "+a);
    }
    
}
