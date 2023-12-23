public class P7 {

    static int  fact(int n){
        if(n<=1)
            return 1;
        else    
            return n*fact(n-1);
    }
    public static void main(String[] args) {
        int a = 6;

        int ans= fact(a);
        System.out.println(ans);

    }
    
}
