package concurrency.multithread;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class BasicThreadTimer extends TimerTask{

    @Override
    public void run() {
     System.out.println("Timer task started at: " + new Date());
     processing();
     System.out.println("Timer task finished at: " + new Date());
    }

    private void processing(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TimerTask timerTask = new BasicThreadTimer();
        Timer timer = new Timer(true);
        timer.scheduleAtFixedRate(timerTask , 1000 ,7  * 1000);
        System.out.println("Timertask started");

        try {
            Thread.sleep(51000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        timer.cancel();
        System.out.println("Timertask cancelled");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
