class Mythread implements Runnable{
    Mythread(){
        System.out.println("Thread is starting");
    }
    public void run(){
        Thread t = Thread.currentThread();
        for(int i=1;i<=3;i++){
            System.out.println("Thread "+t.getName()+" is runnimg");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println(t.getName()+" Thread is completed");
    }
}

public class P2 {
    public static void main(String[] args) {
        Thread t = new Thread(new Mythread());
        t.start();
        try{
            t.join();
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Main thread");

    }
    
}
