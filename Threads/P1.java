class Thread1 extends Thread{
    Thread1(){
        System.out.println("Thread is stating");
    }
    public void run(){
        Thread th = Thread.currentThread();
        for(int i=1;i<=3;i++){
            System.out.println("Thread "+th.getName()+" is running");
            try{
                Thread.sleep(3000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.println("Thread " + th.getName() + " is done.");
    }
}

public class P1 {
    public static void main(String[] args) {
        Thread1 t = new Thread1();
        t.start();
        try{
            t.join();
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Main thread is done");
    }

    
    
}