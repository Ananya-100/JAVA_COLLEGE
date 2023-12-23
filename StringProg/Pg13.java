import java.lang.reflect.Array;
import java.util.Arrays;

public class Pg13 {
    public static void main(String[] args) {
       String s= "hello";
       char[] c = new char[s.length()];
       for(int i = 0;i<s.length();i++){
        c[i]=s.charAt(i);
       }
       Arrays.sort(c);
       String a = new String(c);
       System.out.println(a);
    }
    
}
