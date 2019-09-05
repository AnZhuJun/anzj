package concurrency.multithread;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new BasicRunnable(),"t1");
        Thread t2 = new Thread(new BasicRunnable(),"t2");

        System.out.println("Starting runnable threads");
        t1.start();
        t2.start();
        System.out.println("Runnable threads has started");

        Thread t3 = new BasicThread("t3");
        Thread t4 = new BasicThread("t4");
        t3.start();
        t4.start();
        System.out.println("Runnable threads has started");


    }
}
