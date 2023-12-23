interface Car{
    int  engines=1;
    int  wheels=4;
    int steering=1;
    double engineCapacity();
    int seating();
}
interface LuxCar{
    boolean sensor();
    boolean entertain();
    int air();
}
class Mercedes implements Car,LuxCar{
    public double engineCapacity(){
        return 4.6;
    }
    public int seating(){
        return 4;
    }
    public boolean sensor(){
        return true;
    }
    public boolean entertain(){
        return true;
    }
    public int air(){
        return 4;
    }
}
class Alto implements Car{
    public double engineCapacity(){
        return 4.6;
    }
    public int seating(){
        return 4;
    }
}
public class Pg3 {
    public static void main(String[] args) {
        Mercedes m = new Mercedes();
        System.out.println(m.engineCapacity());
        System.out.println(m.entertain());
        System.out.println(m.seating());
        System.out.println(m.sensor());
        System.out.println(m.air());
    }
    
}
