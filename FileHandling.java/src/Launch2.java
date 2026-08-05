import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Launch2 {
    public static void main(String[] args)throws IOException {
        File dir = new File("Pw");
        File dir1 = new File(dir, "Writing.txt");
        try {
            dir1.createNewFile();
        } catch (Exception e) {
            System.out.println("Some error" + e);
        }
        FileWriter fw=new FileWriter(dir1,true);//if writing true then it will append data in file otherwise it override data in  file
        fw.write("Manas");
        fw.write("\n");
        fw.write("Pw is a Unicorn company");
        fw.write("\n");
        fw.write(65);//store as a ASCII value
        fw.write("\n");
        fw.write(97);
        fw.write("\n");
        char ch[]={'j','a','v','a'};
        fw.write(ch);
        fw.write("\n");

         //to execute you have to close or flush
        fw.close();
        System.out.println("Open writing.txt to see result");

    }
}
