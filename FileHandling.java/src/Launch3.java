import java.io.File;
import java.io.FileReader;

public class Launch3 {
    public static void main(String[] args)throws Exception {
        File dir = new File("Pw");
        File dir1 = new File(dir, "Writing.txt");
        FileReader file=new FileReader(dir1);
        //read is not so convenient because if file size is large then we hve to invoke read method many times  that's why array is used
        char []ch=new char[(int)dir1.length()];
         // int i=file.read();
         file.read(ch);//parameter char[]
        for(char data: ch)
        {
            System.out.print(data);
        }

       // System.out.println((char)i);
       /* while(i!=-1)
        {
            System.out.print(i+"---->");
            System.out.print((char)i);
            i=file.read();
        }*/
    }
}
