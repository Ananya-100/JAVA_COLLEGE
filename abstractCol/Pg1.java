abstract class TwoD{
    double l;
    double b;
    TwoD(double l,double b){
        this.l = l;
        this.b = b;
    }
    TwoD(double l){
        this.l = l;
    }
    abstract void area();
}
class Rectangle extends TwoD{
    Rectangle(double l, double b){
        super(l,b);
    }
    public void area(){
        System.out.println(l*b);
    }
}
class Square extends TwoD{
    Square(double l){
        super(l);
    }
    public void area(){
        System.out.println(l*l);
    }

}

public class Pg1{
    public static void main(String[] args) {
        
        Rectangle r = new Rectangle(3.0,2.0);
        r.area();
        Square s = new Square(2.0);
        s.area();
    }

}