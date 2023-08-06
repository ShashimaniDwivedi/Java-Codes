import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Launch5 {
    public static void main(String[] args)throws Exception{
        File dir = new File("Pw");
        File dir1 = new File(dir, "Writing.txt");
        try {
            FileReader file = new FileReader(dir1);
            BufferedReader br=new BufferedReader(file);
          /* String line =br.readLine();
           while(line!=null)
           {
               System.out.println(line);
               line=br.readLine();
           }*/
            char []ch=new char[(int)dir1.length()];
            file.read(ch);
            for(char data: ch)
            {
                System.out.print(data);
            }
           br.close();
        } catch (Exception e) {
            System.out.println("Some error" + e);
        }
    }
}
