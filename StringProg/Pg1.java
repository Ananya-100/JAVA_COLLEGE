import java.util.*;

class Test{
    void m(String s){
        char[] c = new char[s.length()];
        for(int i = 0;i<s.length();i++){
            c[i]=s.charAt(i);
        }
        for(int i = 0;i<s.length();i++){
            System.out.println(c[i]);
        }
    }
}
public class Pg1 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter string");

        String a = sc.nextLine();
        Test t = new Test();
        t.m(a);
    }

    
}