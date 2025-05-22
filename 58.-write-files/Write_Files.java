import java.io.FileWriter;
import java.io.IOException;

public class Write_Files {
    public static void main(String[] args) {

        try(FileWriter writer = new FileWriter("test.txt")) {
            writer.write("I like pizza!");
            System.out.println("File has been written");
        } catch(IOException e) {
            System.out.println("Could not write file");
        }
    }
}
