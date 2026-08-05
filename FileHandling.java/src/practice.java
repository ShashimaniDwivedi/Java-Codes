import java.io.File;
import java.io.PrintWriter;

public class practice {
    public static void main(String[] args)throws Exception {
        File dir=new File("Pw");
        PrintWriter pw=new PrintWriter("Pw\\Writing.txt");
        pw.println("System Design");
        pw.println(100);
        pw.println(true);
        pw.println(87.8);
        pw.close();
        System.out.println("Open Writing.txt to see result");

    }
}
