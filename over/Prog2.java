class Addition{
    
    Addition(){
        int a = 4;
        int b = 5;
        System.out.println(a+b);
    }
    Addition(int m,int n){
        System.out.println(m+n);
    }
    Addition(char x,char y){
        System.out.println(x+y);
    }
}
public class Prog2 {
    public static void main(String[] args) {
        
        Addition a = new Addition();
        Addition a1 = new Addition(2,4);
        Addition a2 = new Addition('p','c');
    }
    
}
