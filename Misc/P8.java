public class P8 {
    static int fib(int n){
        if(n==0)
        return 0;
        if(n==1)
        return 1;
        else
        return (n-1)+(n-2);

    }
    public static void main(String[] args) {
        int n=10;
        for(int i=1;i<=n;i++){
            System.out.print(fib(i)+" ");
        }
    }
    
}
