import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Audio_Player {
    public static void main(String[] args) {
        
        String filePath = "Beats.wav";
        File file = new File(filePath);


        try(Scanner scanner = new Scanner(System.in);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {
            
            
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response = "";

            while(!response.equals("Q")) {
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");

                response = scanner.next().toUpperCase();

                switch(response) {
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid choice");
                }
            }
        
        } catch(FileNotFoundException e) {
            System.out.println("Audio file is not located.");      
        } catch(UnsupportedAudioFileException e) {
            System.out.println("Audio file is not supported.");
        } catch(LineUnavailableException e) {
            System.out.println("Unable to access audio resource.");
        } catch(IOException e) {
            System.out.println("Somethig went wrong.");
        } finally {
            System.out.println("Bye!");
        }
    }
}