import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Launch6 {
    public static void main(String[] args)throws Exception {
        File dir=new File("Pw");
        File file=new File(dir,"Writing.txt");

        FileWriter fw=new FileWriter(file);
        PrintWriter pw=new PrintWriter(fw);
        /*pw.write(97);
        pw.write("\n");
        pw.write("Java");
        pw.write("\n");*/
        pw.println("java1");
        pw.println(100);
        pw.println(true);
        pw.println("SQL");
        pw.close();
        System.out.println("Open Writing.txt to see Result");
    }
}
