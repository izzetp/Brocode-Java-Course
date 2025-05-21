import java.io.FilterWriter;
import java.io.IOException;

public class Write_Files {
    public static void main(String[] args) {

        try(FileWriter writer = new FileWriter("test.txt");) {
            writer.write("I like pizza!");
        } catch(IOException e) {
            System.out.println("Could not write file");
        }
    }
}
