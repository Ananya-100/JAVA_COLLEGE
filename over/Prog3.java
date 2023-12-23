class Box{
    int s;
    int l,b;
    Box(int s){
        this.s = s;
        int ans = 4*s;
        System.out.println(ans);
    }
    Box(int l,int b){
        this.l = l;
        this.b = b;
        int ans1 = l*b;
        System.out.println(ans1);
    }

}
public class Prog3 {
    public static void main(String[] args) {
        Box b = new Box(4);
        Box b1 = new Box(2,4);
    }
    
}
