package concurrency.executor;

import java.util.concurrent.*;

public class BasicThreadPoolExecutor {
    public static void main(String[] args) throws InterruptedException {
        ThreadPoolExecutor executor = getThreadExecutor();

        MonitorThread monitor = new MonitorThread(executor,3);
        Thread monitorThread = new Thread(monitor);
        monitorThread.start();

        startWorking(executor);

        stopWoring(executor, monitor);
    }

    private static void stopWoring(ThreadPoolExecutor executor, MonitorThread monitor) throws InterruptedException {
        Thread.sleep(30000);
        executor.shutdown();
        Thread.sleep(5000);
        monitor.shutdown();
    }

    private static void startWorking(ThreadPoolExecutor executor) {
        for(int i = 0; i < 10;i++){
            executor.execute(new WorkerThread("cmd" + i));
        }
    }

    private static ThreadPoolExecutor getThreadExecutor() {
        RejectedExecutionHandlerImpl rejectedExecutionHandler = new RejectedExecutionHandlerImpl();
        ThreadFactory threadFactory = Executors.defaultThreadFactory();
        return new ThreadPoolExecutor(2,4,10, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(2),threadFactory,rejectedExecutionHandler);
    }
}
