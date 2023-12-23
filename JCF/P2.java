import java.util.*;
import java.io.*;
public class P2 {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<Integer>();
        l.add(4);
        l.add(2);
        l.add(6);
        Collections.sort(l);
        //Collections.reverse(l);
        System.out.println(l);
    }
}
