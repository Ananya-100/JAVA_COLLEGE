class PrintData{
    synchronized void display(String s){
        for(int i =0;i<s.length();i++){
            System.out.print(s.charAt(i));
        }
    }
}
class Mythread extends Thread{
    PrintData p;
    String s;
    Mythread(PrintData p,String s){
        this.p=p;
        this.s=s;
    }
    public void run(){
        p.display(s);
    }
}

public class LOCKIng {
    public static void main(String[] args) {

        PrintData p = new PrintData();
        Mythread m1 = new Mythread(p, "Hello world");
        Mythread m2 = new Mythread(p, "Good luck");
        m1.start();
        m2.start();
    }
    
}
