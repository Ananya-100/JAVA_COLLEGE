import java.util.*;
import java.io.*;

public class Pg9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter strings");
        String a = sc.nextLine();
        String b = sc.nextLine();
        int maxl = Math.max(a.length(),b.length());
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<maxl;i++){
            if(a.length()<=maxl)
                sb.append(a.charAt(i));
            if(b.length()<=maxl)
                sb.append(b.charAt(i));
        }
        System.out.println(sb);
    }
    
}
