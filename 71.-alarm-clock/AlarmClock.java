import java.time.LocalTime;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;

public class AlarmClock implements Runnable {
    
    private final LocalTime alarmTime;
    private final String filePath;

    AlarmClock(LocalTime alarmTime, String filePath) {
        this.alarmTime = alarmTime;
        this.filePath = filePath;
    }

    @Override
    public void run() {
        while (LocalTime.now().isBefore(alarmTime)) {

            try {
                Thread.sleep(1000);

                LocalTime now = LocalTime.now();

                System.out.printf("\r%02d:%02d:%02d", 
                                now.getHour(), 
                                now.getMinute(), 
                                now.getSecond());
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
        }
        
        System.out.println("*ALARM NOISES*");
        playSound(filePath);
    }
    private void playSound(String filePath) {

        file audioFile = new File(filePath);

        AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);

    }
}
