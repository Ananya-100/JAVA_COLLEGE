import java.util.*;

public class Pg8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name");
        String fname = sc.nextLine();
        System.out.println("Enter middle name");
        String middle =sc.nextLine();
        System.out.println("Enter last name");
        String last = sc.nextLine();
        System.out.println("Enter roll");
        String roll  = sc.nextLine();
        int n = roll.length()-4;
        roll = roll.substring(n);
        StringBuilder res = new StringBuilder();
        res.append(fname.charAt(0));
        if(!middle.isBlank()){
            res.append(middle.charAt(0));

        }
        res.append(last.charAt(0));
        res.append(roll);
        System.out.println(res);
    
    }
}
