import java.util.*;
import java.io.*;
 
public class P1 {
    public static void main(String[] args) {
        
        List<Integer> l = new ArrayList<Integer>();
        l.add(5);
        l.add(4);
        l.add(6);
        int s=0;
        for(int i = 0;i<l.size();i++)
            s+=l.get(i);
        System.out.println(s);
    }
    
}