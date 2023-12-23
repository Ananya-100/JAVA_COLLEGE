package pTwo;
import pOne.A;

public class B extends A{
    public void callMethod() {
        display(); // Calling method from the superclass
        System.out.println("Variable from superclass: " + number); // Accessing variable from the superclass
    }
}

