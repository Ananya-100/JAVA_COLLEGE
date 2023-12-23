/**
 * InnerInter1
 */
interface Shape 
{
    double pie = 3.14;
    void area();
    
}
abstract class Circle implements Shape{
    void area(double r){
        System.out.println(3.14*r*r);
    }
}
abstract class Rectangle implements Shape{
    void area(int l,int b){
        System.out.println(l*b);
    }
}


public class Inter1 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.area(2.0);
        Rectangle r = new Rectangle();
        r.area(2,5 );
    }
}
