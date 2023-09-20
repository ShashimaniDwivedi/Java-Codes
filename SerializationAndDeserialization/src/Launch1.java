import java.io.*;


class Cricketer implements Serializable//Marker interface
{
    private  String name;
    private transient int age;//Selective serialization
    private  int run;
    public Cricketer(String name,int age,int run)
    {
        this.age=age;
        this.name=name;
        this.run=run;
    }
    public void disp()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(run);
    }

}
public class Launch1 {
    public static void main(String[] args)throws Exception {
       Cricketer c=new Cricketer("MS Dhoni",39,5002);
       //For serialization*************************
        FileOutputStream fos=new FileOutputStream("Writing1.txt");
      //to store in more efficient way use Buffered output stream
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        ObjectOutputStream oos=new ObjectOutputStream(bos);
        oos.writeObject(c);
        oos.flush();
        oos.close();

    }
}
