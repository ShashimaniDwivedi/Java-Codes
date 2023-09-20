import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Launch2 {
    public static void main(String[] args)throws Exception {
        //For Deserialization***********************
        FileInputStream fis=new FileInputStream("Writing.txt");
        //to store in more efficient way use Buffered Input stream
        BufferedInputStream bis=new BufferedInputStream(fis);
        ObjectInputStream ois=new ObjectInputStream(bis);
        Cricketer cr=(Cricketer)ois.readObject();//Down casting because its giving object and we want Cricketer type object
        cr.disp();//without making object using disp method because here I am using Serialised object
        ois.close();
    }
}
