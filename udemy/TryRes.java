import java.io.FileReader;
import java.io.IOException;

public class TryRes {
    public static void main(String[] args) {
        //file is res so we have to close but try with resource close it automatically
        try (FileReader file = new FileReader("test.txt")) {

            int data = file.read();

            System.out.println((char) data);

        } catch (IOException e) {
            System.out.println("File error");
        }
    }
}