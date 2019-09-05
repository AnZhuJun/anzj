package three;

import javax.swing.*;

public class Test4 {
    public static void main(String[] args) {
        AlarmClock clock = new AlarmClock(1000,true);
        clock.start();

        JOptionPane.showMessageDialog(null,"exit?");
        System.exit(0);
    }
}
