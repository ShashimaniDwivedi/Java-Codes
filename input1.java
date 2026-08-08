import java.io.*;
public class input1 {
    public static void main(String[] args)throws Exception {
        File file1=new File("pw.txt");
        System.out.println(file1.exists());
        file1.createNewFile();
        System.out.println(file1.exists());
        File dir=new File("PWJAVA");
        dir.mkdir();
        File file =new File(dir,"Pw.txt");
        file.createNewFile();
    }
    
}
