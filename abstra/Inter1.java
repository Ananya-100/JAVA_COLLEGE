
interface Shape{
    double pie = 3.14;
    void area();
    
}
class Circle implements Shape{
    private double r;
    Circle(double r){
        this.r = r;
    }
    public void area(){
        System.out.println(3.14*r*r);
    }
}
class Rectangle implements Shape{
    private double l,b;
    Rectangle(double l,double b){
        this.l=l;
        this.b=b;
    }
    public void area(){
        System.out.println(l*b);
    }
}


public class Inter1{
    public static void main(String[] args) {
        Circle c = new Circle(5.0);
        c.area();
        Rectangle r = new Rectangle(2.0,6.0);
        r.area()O;
    }
}
