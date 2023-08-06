import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Launch4 {
    public static void main(String[] args) {
        File dir = new File("Pw");
        File dir1 = new File(dir, "Writing.txt");
        try {
            FileWriter file = new FileWriter(dir1);
            BufferedWriter bw=new BufferedWriter(file);
            bw.write("java is Best from any other language like");
            bw.newLine();
            bw.write("cobal");
            bw.newLine();
            bw.write("Frontran");
            bw.newLine();
            bw.write(65);
            bw.newLine();
            char ch[]={'C','s','h','a','r','p'};
            bw.write(ch);
            bw.close();
        } catch (Exception e) {
            System.out.println("Some error" + e);
        }
    }
}
