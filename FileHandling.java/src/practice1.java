import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class practice1 {
    public static void main(String[] args)throws Exception {
        FileWriter file=new FileWriter("Pw\\Writing.txt");
        file.write("Operating System");
        file.write("\n");
        file.write(97);
        file.write("\n");
        char ch[]={'j','a','v','a'};
        file.write(ch);
        file.close();
        System.out.println("Open Writing.txt to see result");
        FileReader file1=new FileReader("Pw\\Writing.txt");
        BufferedReader br=new BufferedReader(file1);
        int i=br.read();
        while(i!=-1)
        {
            System.out.print((char)i);
            i=br.read();
        }

    }
}
