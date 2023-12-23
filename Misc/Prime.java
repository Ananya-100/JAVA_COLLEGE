public class Prime {

    static boolean isPrime(int n,int i){
        if(n<=2){
            return (n==2) ? true : false;
        }
        if (n%i==0)
            return false;
        if(i*i>n)
            return true;
        else
            return isPrime(n, i+1);
    }
    public static void main(String[] args) {
        int n=10;
        for(int i= 0;i<=n;i++){
           if(isPrime(i, 2))
            System.out.print(i+" ");
        }
        
    }
    
}
