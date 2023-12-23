class Super{
    void t(){
        System.out.println("This is Super class");
    }
}

public class P5 {
    public static void main(String[] args) {
        Super s  = new Super(){
            void t(){
                System.out.println("T is method");
            }
        };
        s.t();
        Super s1 = new Super();
        s1.t(); 
    }
}
