import java.util.*;

class Pg2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s1 = sc.nextLine();

        System.out.println("enter character arry");
        String s = sc.nextLine();
        char c[] = new char[s.length()];
        for(int i =0;i<s.length();i++){
            c[i]=s.charAt(i);
        }
        StringBuilder res = new StringBuilder();
        res.append(c);
        res.append(s1);
        System.out.println(res);
        

    }
}