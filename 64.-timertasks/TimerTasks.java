import java.util.Timer;
import java.util.TimerTask;

public class TimerTasks {
    public static void main(String[] args) {
        
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            int count = 3;

            @Override
            public void run() {
                System.out.println("Hello!");
                count--;
                if (count <= 0) {
                    System.out.println("Task Complete!");
                    timer.cancel();
                }
            }
        };

        timer.schedule(task, 0, 1000);

    }
}
