package concurrency.lock;

import java.util.concurrent.locks.ReentrantLock;

public class BasicReentrantLock implements Runnable {
    public static ReentrantLock lock = new ReentrantLock();
    private static int i =0;

    @Override
    public void run() {
        for(int j = 0; j <10000000;j++){
            lock.lock();
            try {
                i++;
            }finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        BasicReentrantLock rlock = new BasicReentrantLock();
        Thread t1 = new Thread(rlock);
        Thread t2 = new Thread(rlock);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(i);
    }
}
