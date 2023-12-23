interface Shape{
    double pie = 3.14;
    double area();
}
class Circle implements Shape{
    private double radius;
    Circle(double radius){
        this.radius =radius;
    }
    public double area(){
        return radius * pie *radius;
    }
}
class Rectangle implements Shape{
    private double l,b;
    Rectangle(double l,double b){
        this.l =l;
        this.b = b;
    }
    public double area(){
        return l*b;
    }
}
public class Pg1{
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        // Calculating areas
        double circleArea = circle.area();
        double rectangleArea = rectangle.area();

        // Displaying areas
        System.out.println("Area of Circle: " + circleArea);
        System.out.println("Area of Rectangle: " + rectangleArea);
    }
}