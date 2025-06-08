import 

public class TimerTasks {
    public static void main(String[] args) {
        
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Hello!");
            }
        };

        timer.schedule(task, 3000);
        
    }
}
