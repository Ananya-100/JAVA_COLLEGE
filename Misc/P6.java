public class P6 {
    public static void main(String[] args) {
        int a =0;
        int s=0;
        a = Integer.parseInt(args[0]);
        while(a!=0){
            int t =a%10;
            s=s+t;
            a=a/10;
        }
        System.out.println(s);
    }
    
}
