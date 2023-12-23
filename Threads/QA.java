class Mythread extends Thread{
    public void run(){
        Thread t= Thread.currentThread();
        System.out.println(t.getName()+ " has started");
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println(t.getName()+ " has finished");
    }
}

/**
 * Q&A
 */
public class QA {
    public static void main(String[] args) {
        Mythread th = new Mythread();
        th.start();
        if(th.isAlive())
            System.out.println(th.getName()+" running");
        try{
            th.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        if(th.isAlive())
             System.out.println(th.getName()+" running");
        else
            System.out.println(th.getName()+" finished");
        System.out.println("Main thread fininhed");

    }
    
}