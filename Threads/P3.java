class MultiThread extends Thread{
    MultiThread(String name,int priority){
        super(name);
        setPriority(priority);
    }
    public void run(){
        Thread t = Thread.currentThread();
        
            for(int i=0;i<=3;i++){
            System.out.println(t.getName()+" -count : "+i);
            }
    
        System.out.println("Done");
    }
}

public class P3 {
    public static void main(String[] args) {
        Thread t1 = new MultiThread("Thread -1",Thread.MAX_PRIORITY);
        Thread t2 = new MultiThread("Thread -2",Thread.MIN_PRIORITY);
        Thread t3 = new MultiThread("Thread -3",Thread.MAX_PRIORITY);
        Thread t4 = new MultiThread("Thread -4",Thread.NORM_PRIORITY);
        Thread t5 = new MultiThread("Thread -5",Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        try{
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Main");
    }

    
}
