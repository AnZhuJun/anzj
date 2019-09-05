package concurrency.multithread;

import java.util.Date;

public class BasicMethodSync implements Runnable {
//    static BasicMethodSync instance = new BasicMethodSync();
    static int i = 0;

    private static synchronized void increase(){
        i++;
    }

//    private synchronized void increase(){
//        i++;
//    }

    @Override
    public void run() {
        for(int j = 0; j < 50000000; j++)
            increase();
    }

    public static void main(String[] args) throws InterruptedException {
//        Thread t1 = new Thread(instance);
//        Thread t2 = new Thread(instance);
//        Thread t3 = new Thread(instance);
//        Thread t4 = new Thread(instance);

        Thread t1 = new Thread(new BasicMethodSync());
        Thread t2 = new Thread(new BasicMethodSync());
        Thread t3 = new Thread(new BasicMethodSync());
        Thread t4 = new Thread(new BasicMethodSync());

        System.out.println(new Date());
        long prve = System.currentTimeMillis();

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();

        long cur = System.currentTimeMillis();

        System.out.println(i);
        System.out.println(new Date());

        System.out.println("time: " + (cur - prve));
    }
}
