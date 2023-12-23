import java.util.*;

class Armstrong {
    static boolean isArm(int n){
        int num=n;
        int c=0;
        while (num!=0) {
            c++;
            num=num/10;
        }
        int t=n;
        int s=0;
        while (t!=0) {
            int r = t%10;
            s = s+(int)Math.pow(r, c);
            t=t/10;
        }
        if(s==n)
        return true;
        else
        return false;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nember");
        int n = sc.nextInt();
        for(int i =0;i<=n;i++){
            if(isArm(i)){
                System.out.print(i+" ");
            }
        }
    }
    
}
