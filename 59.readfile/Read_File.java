import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Read_File {
    public static void main(String[] args) {

        String filePath = "";

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            System.out.println("That file exists");
        } catch(FileNotFoundException e) {
            System.out.println("Could not locate file");
        } catch(IOException e) {
            System.out.println("Something went wrong");
        }
    }
}
