abstract class TwoD{
    int s,l,b;
    TwoD(int s){
        this.s=s;
    }
    TwoD(int l,int b){
        this.l=l;
        this.b=b;
    }
    abstract void area();

}
class Rectangle extends TwoD{
    Rectangle(int l,int b){
        super(l,b);
    }
    void area(){
        System.out.println(l*b);
    }
}
class Square extends TwoD{
    Square(int s){
        super(s);
    }
    void area(){
        System.out.println(s*s);
    }
}

public class P1 {
    public static void main(String[] args) {
        Square s =new Square(3);
        s.area();
        Rectangle r = new Rectangle(3, 2);
        r.area();
    }
    
}
