import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;

public class Audio_Player {
    public static void main(String[] args) {
        
        String filePath = "";
        File file = new File(filePath);

        try(AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {
            Clip clip = AudioSystem.getClip();
        } catch(UnsupportedAudioFileException e) {
            System.out.println("Audio file is not supported.");
        } catch(LineUnavailableException e) {
            System.out.println("Unable to access audio resource.");
        } catch(IOException e) {
            System.out.println("Somethig went wrong.");
        }
    }
}